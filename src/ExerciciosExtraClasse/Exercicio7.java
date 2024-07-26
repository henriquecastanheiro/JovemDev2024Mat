package ExerciciosExtraClasse;

public class Exercicio7 {

	public class LevenshteinDistance {
		/*
		 * Desenvolver um programa em Java que calcule a distância de Levenshtein e a
		 * similaridade entre duas strings. A distância de Levenshtein é uma métrica
		 * para medir a diferença entre duas sequências, enquanto a similaridade é
		 * calculada com base nessa distância.
		 */
		public static int levenshteinDistance(String s1, String s2) {
			int m = s1.length();
			int n = s2.length();

			if (m == 0)
				return n;
			if (n == 0)
				return m;
			int[][] dp = new int[m + 1][n + 1];
			for (int i = 0; i <= m; i++) {
				dp[i][0] = i;
			}
			for (int j = 0; j <= n; j++) {
				dp[0][j] = j;
			}
			for (int i = 1; i <= m; i++) {
				for (int j = 1; j <= n; j++) {
					int cost = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1;
					dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1), dp[i - 1][j - 1] + cost);
				}
			}
			return dp[m][n];
		}

		public static double similarity(String s1, String s2) {
			int distance = levenshteinDistance(s1, s2);
			return 1.0 - ((double) distance / Math.max(s1.length(), s2.length()));
		}

		public static void main(String[] args) {
			String s1 = "Henrique Vicente Castanheiro";
			String s2 = "Henrique Castanheiro";

			int distance = levenshteinDistance(s1, s2);
			double similarity = similarity(s1, s2);

			System.out.println("Distância de Levenshtein entre \"" + s1 + "\" e \"" + s2 + "\": " + distance);
			System.out.println("Similaridade entre \"" + s1 + "\" e \"" + s2 + "\": " + similarity);
		}
	}

}
