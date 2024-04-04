package car.view;

import car.model.Car;
import car.model.RacingCars;

import java.util.List;

public class Output {
    public void gameResultMessage(){
        System.out.println("\n실행 결과");
    }
    public void gameStatus(List<String> results){
        for (String result : results) {
            System.out.println(result);
        }
        System.out.println();
    }
    public void gameWinner(String winner){
        System.out.println(winner + "가 최종 우승했습니다.");
    }
}
