import CalculatorExample from './src/CalculatorExample';

function run () {
  const calculator = new CalculatorExample();
  const a = 1;
  const b = 2;
  const additionResult = calculator.add(1, 2);

  console.log(`${a} + ${b} = ${additionResult}`);
}

run();
