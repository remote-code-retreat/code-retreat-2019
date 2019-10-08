import should from 'should';
import CalculatorExample from '../../src/CalculatorExample';

describe('CalculatorExample', () => {
  it('adds two numbers', () => {
    const calculator = new CalculatorExample();
    should(calculator.add(5,1)).be.equal(6);
  })

  it('substracts two numbers', () => {
    const calculator = new CalculatorExample();
    should(calculator.substract(5, 1)).be.equal(4);
  })
});
