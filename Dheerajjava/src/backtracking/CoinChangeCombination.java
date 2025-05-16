package backtracking;

public class CoinChangeCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoinChangeCombinations(new int[] { 2, 3, 5, 6 }, 10, "", 0);
	}

	public static void CoinChangeCombinations(int[] denom, int amount, String ans, int LastIndexUsed) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = LastIndexUsed; i < denom.length; i++) {
			if (amount >= denom[i]) {
				CoinChangeCombinations(denom, amount - denom[i], ans + denom[i], i);

			}
		}
	}

}
