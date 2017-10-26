package crowdy;

import java.util.Random;

public class Animal2 {
	public static void main(String[] args) {
		//20마리 동물이름 배열
		String[] animals =
			{"고양이","강아지","호랑이","돌고래","금붕어","앵무새","닭","소","돼지","늑대","원숭이","개구리","매미","오리","비둘기","모기","양","박쥐","갈매기","오징어"};
		//동물 이름과 같은 인덱스로 울음소리 배열
		String[] animalsSound =
			{"야옹","멍멍","어흥","","","","꼬끼오","음메","꿀꿀","아오","끼끼","개굴","맴맴","꽥꽥","구구","앵앵","매애","","끼룩",""};
		//반복문으로 20마리 모두 출력
		for(int i = 0; i < animals.length; i++){
			if(animals[i]=="금붕어"||animals[i]=="오징어"){
				//금붕어나 오진어는 울지 못한다.
				System.out.println(animals[i]+"는/은 울지 못한다.");
			}else if(animals[i]=="돌고래"||animals[i]=="박쥐"){
				//돌고래나 박쥐는 초음파를 낸다.
				System.out.print(animals[i]+"는/은 인간이 들을 수 없는 소리로 운다.");
				System.out.println("-초음파");
			}else if(animals[i]=="앵무새"){
				//앵무새는 소리를 따라한다.
				System.out.print(animals[i]+"는/은 인간이 들을 수 있는 소리로 운다.");
				// 따라하는 동물 random으로 출력
				Random r = new Random();
				int reIdx = r.nextInt(animals.length);
				String reAnimal = (animals[reIdx]);
				String reSound = (animalsSound[reIdx]);
				if(reSound==""){
					//울음소리가 없거나 초음파인 동물은 따라하지 못한다.
					System.out.println("-"+reAnimal+"의 울음소리는 따라하지 못한다.");
				}else{
					//울음소리가 있으면 따라한다.
					System.out.print("-"+reAnimal+"의 울음소리를 따라한다.");
					System.out.println("-"+reSound);
				}//if~else end
			}else{
				System.out.print(animals[i]+"는/은 인간이 들을 수 있는 소리로 운다.");
				System.out.println("-"+animalsSound[i]);
			}//if~else end
		}//for() end
		
	}//main() end
}//class Animal2 end
