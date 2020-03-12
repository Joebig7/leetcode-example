package geek._03_recursive;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2020/3/10 21:28
 * @description
 */
public class StoneStepDemo {

    public static  int solution(int n) {

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }


        return solution(n - 1) + solution(n - 2);

    }

    public static void main(String[] args) {
        System.out.println(solution(45));
    }
}