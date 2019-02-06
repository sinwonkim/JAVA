package javaStudy;

public class arrayStudy0 {
	
	public static void main(String[] args) {
		
		String[] lolC = new String[5];
		lolC[0] = "탑: 야스오";
		lolC[1] = "미드: 제드";
		lolC[2] = "원딜: 베인";
		lolC[3] = "서폿: 알리스타";
		lolC[4] = "정글: 녹턴";
		
		//상대팀도 적어줘야징  다른 방식으로 배열을 적어보자
		
		String[] lolC2 = {"탑: 나서스","미드: 갈리오","원딜: 이즈리얼","서폿: 소나","정글: 신짜오"};
		
		System.out.print("블루 팀 - ");
		for(int i = 0; i<lolC.length; i++ ) {
			System.out.print(lolC[i]+" ");
		
		}
		System.out.println();
		System.out.print("레드 팀 - ");
		for(int i = 0; i<lolC.length; i++ ) {
		
			System.out.print(lolC2[i]+" ");
		}
	}
}
