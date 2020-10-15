package fr.unistra.fizzbuzz;

public class ProblemSolver implements Displayer, Int2String {

    public void solve(int n){
        for (int i = 1; i<=n; i++){
            display(convert(i));
        }
    }
}
