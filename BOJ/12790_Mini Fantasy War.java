import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int compat_power;

        for (int i=0; i<count; i++) {
            int hp = sc.nextInt();
            int mp = sc.nextInt();
            int atk = sc.nextInt();
            int dfs = sc.nextInt();
            int additional_hp = sc.nextInt();
            int additional_mp = sc.nextInt();
            int additional_atk = sc.nextInt();
            int additional_dfs = sc.nextInt();

            if (1 > hp + additional_hp) {
                hp = 1;
                additional_hp = 0;
            }
            if (1 > mp + additional_mp) {
                mp = 1;
                additional_mp = 0;
            }
            if (0 > atk + additional_atk) {
                atk = 0;
                additional_atk = 0;
            }
            compat_power = (hp + additional_hp)
                    + (5 * (mp + additional_mp))
                    + (2 * (atk + additional_atk))
                    + (2 * (dfs + additional_dfs));

            System.out.println(compat_power);
        }
    }
}