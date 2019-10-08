"use strict";
exports.__esModule = true;
var CalculatorExample_1 = require("./src/CalculatorExample");
function run() {
    var calculator = new CalculatorExample_1["default"]();
    var a = 1;
    var b = 2;
    var additionResult = calculator.add(1, 2);
    console.log(a + " + " + b + " = " + additionResult);
}
run();
