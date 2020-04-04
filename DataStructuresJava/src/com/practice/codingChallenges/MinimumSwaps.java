package com.practice.codingChallenges;

public class MinimumSwaps {
	public static void main(String[] args) {
//		int[] a = {1,3,5,2,4,6,7};
//		int[] a = {2,3,4,1,5};
		int[] a = { 7, 1, 3, 2, 4, 5, 6 };
//		int[] a = {4,3,1,2};
//		int[] a =  {72,55,7,287,212,121,303,12,43,252,351,494,174,160,128,258,479,290,109,285,445,24,286,224,432,152,42,257,405,448,15,159,363,347,402,57,176,317,488,299,449,310,54,163,9,430,473,412,155,394,201,166,477,220,359,79,198,175,344,61,213,392,94,499,335,361,362,301,265,23,56,460,137,383,295,1,30,282,188,427,53,29,254,489,158,500,44,2,105,421,107,149,284,307,440,291,330,77,216,329,27,409,115,69,264,206,208,144,386,357,82,146,181,148,221,141,229,278,47,452,340,71,316,170,123,232,356,16,346,80,102,138,256,462,415,247,189,129,225,426,283,311,226,434,396,118,276,122,377,244,28,234,73,101,86,348,84,428,20,457,482,269,245,418,369,83,17,191,354,422,315,250,328,210,211,113,207,478,183,150,228,58,236,263,215,132,126,312,78,251,171,68,106,13,116,114,292,395,99,134,404,381,439,401,233,60,435,67,270,355,180,142,52,241,190,464,358,467,491,471,371,6,92,331,319,253,127,368,309,406,288,173,261,323,167,235,466,463,350,218,380,268,187,119,455,321,446,420,465,209,410,19,223,168,25,50,384,214,91,108,267,314,112,407,97,364,373,352,184,125,219,289,196,153,8,318,353,136,370,195,217,308,271,458,495,413,162,164,110,399,416,199,172,179,34,143,154,193,474,349,248,481,322,33,205,490,104,483,243,379,385,186,147,237,306,161,343,281,238,259,476,442,414,262,40,492,339,403,378,231,470,260,76,194,46,45,66,202,441,493,486,204,498,246,424,366,487,324,239,408,472,64,431,255,31,74,177,89,425,333,130,230,376,438,185,124,300,485,87,417,85,18,437,342,390,192,294,240,480,274,447,139,391,41,326,178,14,22,475,103,151,156,496,388,374,450,140,111,429,131,81,453,334,302,222,459,365,273,59,325,497,327,203,90,293,338,227,26,10,367,38,96,37,266,135,93,49,21,242,169,398,436,372,484,3,280,389,62,39,419,51,200,397,469,297,360,197,65,423,313,456,145,454,157,298,393,70,444,433,5,75,337,272,345,451,11,249,375,296,133,443,182,279,387,468,100,400,95,305,304,277,382,32,320,461,98,411,35,275,4,88,117,332,63,120,36,48,341,336,165};
		int tempPos = 0;
		int temp = 0;
		int count = 0;
		int n=a.length -1;
		for (int i = 0; i < n; i++) {
			if(i <a[i]-1) {
				swap(a,i,Math.min(n, a[i]-1));
				count++;
				i--;
			}
		}
		System.out.println(count);
		for (int i1 = 0; i1 < a.length; i1++) {
			System.out.print(a[i1] + " ,");
		}

	}
	private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
