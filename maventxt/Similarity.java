package maventxt;

public class Similarity {

	public static double getSimilarity(String simHash0, String simHash1)  {
	        // 通过 simHash1 和 simHash2 获得它们的海明距离
	        int distance = getHammingDistance(simHash0, simHash1);
	        // 通过海明距离计算出相似度，并返回
	        return 0.01*(100 - distance * 100 / 128);
	    }
	
    public static int getHammingDistance(String simHash0, String simHash1) {
        int distance = 0;
        if (simHash0.length() != simHash1.length()) {
            distance = -1;
            System.out.println("simhash长度不一致，请注意！");
        } else {
            for (int i = 0; i < simHash0.length(); i++) {
                // 每一位进行比较
                if (simHash0.charAt(i) != simHash1.charAt(i)) {
                    distance++;
                }
            }
        }
        return distance;
    }
	}
