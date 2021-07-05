public class Diamond_pattern {

	public static void main(String[] args) {
		// if文の中でrowとcolumnの和を絶対値で求めて判定する方法

		for (int row = 5; row > -6; row--) { // row = たて
			for (int column = -5; column < 6; column++) { // column = よこ
				if (Math.abs(row) + Math.abs(column) <= 5) {
					System.out.print("*" + " ");
				}
				else {
					System.out.print("_" + " ");
				}
			}
			System.out.println();
		}
	}
}
/*　↓イメージ
_ _ _ _ 4 _ _ _ _
_ _ _ 4 3 4 _ _ _
_ _ 4 3 2 3 4 _ _
_ 4 3 2 1 2 3 4 _
4 3 2 1 0 1 2 3 4
_ 4 3 2 1 2 3 4 _
_ _ 4 3 2 3 4 _ _
_ _ _ 4 3 4 _ _ _
_ _ _ _ 4 _ _ _ _
*/