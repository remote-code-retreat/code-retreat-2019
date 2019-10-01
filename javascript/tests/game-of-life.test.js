const { nextGeneration } = require("../src/game-of-life");

test("GameOfLife is defined", () => {
  expect(nextGeneration).toBeDefined();
});
