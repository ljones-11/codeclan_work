import React from 'react';
import Calculator from '../containers/Calculator';
import {render, fireEvent} from '@testing-library/react';

describe('Calculator', () => {
  let container;
  beforeEach(() => {
    container = render(<Calculator/>)
  })

  it('should change running total on number enter', () => {
    const button4 = container.getByTestId('number4');
    const runningTotal = container.getByTestId('running-total');
    fireEvent.click(button4);
    expect(runningTotal.textContent).toEqual('4');
  })

  it('Should add two numbers', () => {
    const one = container.getByTestId('number1');
    const add = container.getByTestId('operator-add')
    const four = container.getByTestId('number4');
    const equals = container.getByTestId('operator-equals')
    const runningTotal = container.getByTestId('running-total')
    fireEvent.click(one);
    fireEvent.click(add);
    fireEvent.click(four);
    fireEvent.click(equals);
    expect(runningTotal.textContent).toEqual('5')
  })

  it('Should subtract two numbers', () => {
    const seven = container.getByTestId('number7');
    const subtract = container.getByTestId('operator-subtract')
    const four = container.getByTestId('number4');
    const equals = container.getByTestId('operator-equals')
    const runningTotal = container.getByTestId('running-total')
    fireEvent.click(seven);
    fireEvent.click(subtract);
    fireEvent.click(four);
    fireEvent.click(equals);
    expect(runningTotal.textContent).toEqual('3')
  })

  it('Should multiply two numbers', () => {
    const three = container.getByTestId('number3');
    const multiply = container.getByTestId('operator-multiply')
    const five = container.getByTestId('number5');
    const equals = container.getByTestId('operator-equals')
    const runningTotal = container.getByTestId('running-total')
    fireEvent.click(three);
    fireEvent.click(multiply);
    fireEvent.click(five);
    fireEvent.click(equals);
    expect(runningTotal.textContent).toEqual('15')
  })

  it('Should divide two numbers', () => {
    const two = container.getByTestId('number2');
    const one = container.getByTestId('number1')
    const divide = container.getByTestId('operator-divide')
    const seven = container.getByTestId('number7');
    const equals = container.getByTestId('operator-equals')
    const runningTotal = container.getByTestId('running-total')
    fireEvent.click(two);
    fireEvent.click(one);
    fireEvent.click(divide);
    fireEvent.click(seven);
    fireEvent.click(equals);
    expect(runningTotal.textContent).toEqual('3')
  })

  it('Should concatenate multiple number clicks', () => {
    const two = container.getByTestId('number2');
    const one = container.getByTestId('number1')
    fireEvent.click(two);
    fireEvent.click(one);
    const runningTotal = container.getByTestId('running-total')
    expect(runningTotal.textContent).toEqual('21')
  })

  it('Should chain multiple operations together', () => {
    const two = container.getByTestId('number2');
    const one = container.getByTestId('number1');
    const three = container.getByTestId('number3');
    const add = container.getByTestId('operator-add');
    const equals = container.getByTestId('operator-equals');

    fireEvent.click(two);
    fireEvent.click(add);
    fireEvent.click(one);
    fireEvent.click(add);
    fireEvent.click(three);
    fireEvent.click(equals);
    const runningTotal = container.getByTestId('running-total')
    expect(runningTotal.textContent).toEqual('6')
  })

  it('Should clear running total without affecting calculation', () => {
    const two = container.getByTestId('number2');
    const one = container.getByTestId('number1');
    const add = container.getByTestId('operator-add');
    const equals = container.getByTestId('operator-equals');
    const clear = container.getByTestId('clear');
    fireEvent.click(two);
    fireEvent.click(add);
    fireEvent.click(one);
    fireEvent.click(equals);
    fireEvent.click(clear);
    fireEvent.click(add);
    fireEvent.click(two);
    fireEvent.click(equals);
    const runningTotal = container.getByTestId('running-total')
    expect(runningTotal.textContent).toEqual('5')
  })
})

