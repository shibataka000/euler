package euler.problems

object Problem01 {
  def solve = (1 to 999).filter(x => x % 3 == 0 || x % 5 == 0).sum
}
