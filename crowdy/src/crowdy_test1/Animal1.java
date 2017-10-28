package crowdy_test1;

import java.util.ArrayList;
import java.util.Random;

public class Animal1 {
public static void main(String[] args) {
		//31마리 동물이름 배열
		String[] animals =
			{"0고양이","1강아지","2호랑이","3돌고래","4금붕어","5앵무새","6닭","7소","8돼지","9늑대","10원숭이","11개구리","12매미","13오리","14비둘기","15모기","16양","17박쥐","18갈매기","19오징어","20참새","21부엉이","22코끼리","23말","24쥐","25나방","26문어","27병아리","28까마귀","29물개","30소쩍새"};
		//동물 이름과 같은 인덱스로 울음소리 배열
		String[] animalSound =
			{"0야옹","1멍멍","2어흥","","","5앵무새","6꼬끼오","7음메","8꿀꿀","9아오","10끼끼","11개굴","12맴맴","13꽥꽥","14구구","15앵앵","16매애","","18끼룩","","20짹짹","21부엉","22뿌우","23히잉","24찍찍","","","27삐약","28까악","29엉엉","30소쩍"};
		ArrayList<String> ranAnimalSound = new ArrayList<String>();
		ArrayList<String> ranAnimals = new ArrayList<String>();
		//Random API
		Random r = new Random();
		//인덱스를 랜덤으로 선언
		for(int i = 0; i < 20; i++){
		int idx = r.nextInt(animals.length);
		//인덱스에 따른 동물과 울음소리 
		//랜덤으로 1개씩 출력
		String ranAnimal = (animals[idx]);
		String ranSound = (animalSound[idx]);
		ranAnimals.add(ranAnimal);
		ranAnimalSound.add(ranSound);
		if(ranAnimal=="4금붕어" || ranAnimal=="19오징어"|| ranAnimal=="26문어"){
			//금붕어나 오진어는 울지 못한다.
			System.out.println(ranAnimal+"는은/ 울지 못한다.");
		}else if(ranAnimal=="3돌고래"||ranAnimal=="17박쥐"||ranAnimal=="25나방"){
			//돌고래나 박쥐는 초음파를 낸다.
			System.out.print(ranAnimal+"는/은 인간이 들을 수 없는 소리로 운다.");
			System.out.println("-초음파");
		}else if(ranAnimal=="5앵무새"){
			//앵무새는 소리를 따라한다.
			System.out.print(ranAnimal+"는/은 인간이 들을 수 있는 소리로 운다.");
			// 따라하는 동물 random으로 출력
			if(ranAnimalSound.indexOf(ranSound)-1==-1||ranAnimalSound.get(ranAnimalSound.indexOf(ranSound)-1)==""){
				//울음소리가 없거나 초음파인 동물은 따라하지 못한다.
				System.out.println("-앵무새 고유의 소리를 낸다.");
			}else{
				//울음소리가 있으면 따라한다.
				System.out.print("-"+ranAnimals.get(ranAnimalSound.indexOf(ranAnimal)-1)+"의 울음소리를 따라한다.");
				System.out.println("-"+ranAnimalSound.get(ranAnimalSound.indexOf(ranSound)-1));
			}//if~else end
		}else{
			System.out.print(ranAnimal+"는/은 인간이 들을 수 있는 소리로 운다.");
			System.out.println("-"+ranSound);
		}//if~end end
		}//for()end
	}//main() end
}//class Animal1 end
