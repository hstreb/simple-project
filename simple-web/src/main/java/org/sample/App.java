package org.sample;

import static spark.Spark.get;
import static spark.Spark.before;

import org.apache.log4j.Logger;
import org.sample.calculator.Calculator;

import spark.Route;

public class App {

	private static final Logger log = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {
		get("/", getHello());

		get("/add/:a/:b", getAdd());

		before((request, response) -> log.info(request.requestMethod() + " " + request.pathInfo()));
	}

	private static Route getHello() {
		return (req, res) -> "Hello World";
	}

	private static Route getAdd() {
		Calculator calculator = new Calculator();
		return (req, res) -> {
			int a = Integer.parseInt(req.params("a"));
			int b = Integer.parseInt(req.params("b"));
			return calculator.add(a, b);
		};
	}
}
