from src.game_of_life import next_generation

def test_next_generation():
  result = next_generation()
  assert result == 'foo'
