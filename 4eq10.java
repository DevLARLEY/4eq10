import javax.script.ScriptEngineManager;

import java.util.ArrayList;
import java.util.Stack;

import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class fourEQten {

    public static ScriptEngineManager m = new ScriptEngineManager();
    public static ScriptEngine p = m.getEngineByName("js");
    public static int k(String s, int a){if(s.charAt(a)!='(')return -1;
        Stack<Integer> st=new Stack<>();for(int i = a; i<s.length(); i++){
            if(s.charAt(i)=='('){st.push((int)s.charAt(i));}else if(s.charAt(i)==')'){st.pop();if(st.empty())return i;}}return -1;}
    public static String rrb(String s) throws ScriptException { /* By github.com/DevLARLEY on 2023/7/15 */
        int j=0;String d=s;try{p.eval(s);}catch(ScriptException x){return null;}int r=d.length()-d.replace("(","").replace(")","").length();
        for(int b=0;b<r;b++){int o=0;int c=0;for(int a=0;a<s.length();a++){if(j>a)continue;if(s.charAt(a)=='('){o=a;c=k(s,a);break;}}
            String m=s;if(o<j||m.length()==m.replace("(","").replace(")","").length()){break;}
            String e=s.substring(0,o)+s.substring(o+1);String f=e.substring(0,c-1)+e.substring(c);
            if(p.eval(s).toString().equals(p.eval(f).toString())){s=f;}else{j++;}}return s;
    }
    public static void main(String[] args) throws ScriptException {
        ArrayList<String> sols = new ArrayList<>();

        String exclude = "";
        String[] arr1;
        String start = null;
        if(args.length >= 1) {
            arr1 = args[0].split("");
            start = arr1[0] + "." + arr1[1] + "." + arr1[2] + "." + arr1[3];
            if(args.length > 1) {
                arr1 = args[0].split("");
                start = arr1[0] + "." + arr1[1] + "." + arr1[2] + "." + arr1[3];
                exclude = args[1];
            }
        }

        int count=0;
        if(start != null){
            long t1= System.nanoTime();
            for(int a = 0; a < 4; a++){
                for(int b = 0; b < 4; b++){
                    switch (a) {
                        case 0:
                            switch (b) {
                                case 1:
                                    start = start.substring(2, 3) + start.substring(1, 2) + start.substring(0, 1) + start.substring(3, start.length());
                                    break;
                                case 2:
                                    start = start.substring(4, 5) + start.substring(1, 4) + start.substring(0, 1) + start.substring(5, start.length());
                                    break;
                                case 3:
                                    start = start.substring(6, start.length()) + start.substring(1, 6) + start.substring(0, 1);
                                    break;
                            }
                            break;
                        case 1:
                            switch (b) {
                                case 0:
                                    start = start.substring(2, 3) + start.substring(1, 2) + start.substring(0, 1) + start.substring(3, start.length());
                                    break;
                                case 2:
                                    start = start.substring(0, 2) + start.substring(4, 5) + start.substring(3, 4) + start.substring(2, 3) + start.substring(5, start.length());
                                    break;
                                case 3:
                                    start = start.substring(0, 2) + start.substring(6, start.length()) + start.substring(3, 4) + start.substring(4, 6) + start.substring(2, 3);
                                    break;
                            }
                            break;
                        case 2:
                            switch (b) {
                                case 0:
                                    start = start.substring(4, 5) + start.substring(1, 2) + start.substring(2, 4) + start.substring(0, 1) + start.substring(5, start.length());
                                    break;
                                case 1:
                                    start = start.substring(0, 2) + start.substring(4, 5) + start.substring(3, 4) + start.substring(2, 3) + start.substring(5, start.length());
                                    break;
                                case 3:
                                    start = start.substring(0, 4) + start.substring(6, start.length()) + start.substring(5, 6) + start.substring(4, 5);
                                    break;
                            }
                            break;
                        case 3:
                            switch (b) {
                                case 0:
                                    start = start.substring(6, start.length()) + start.substring(1, 6) + start.substring(0, 1);
                                    break;
                                case 1:
                                    start = start.substring(0, 2) + start.substring(6, start.length()) + start.substring(3, 6) + start.substring(2, 3);
                                    break;
                                case 2:
                                    start = start.substring(0, 4) + start.substring(6, start.length()) + start.substring(5, 6) + start.substring(4, 5);
                                    break;
                            }
                            break;
                    }
                    for(int e = 0; e < 4; e++){
                        switch (e) {
                            case 0:
                                if(!exclude.contains("+")){
                                    start = start.substring(0, 1) + "+" + start.substring(2, start.length());
                                    break;
                                }
                            case 1:
                                if(!exclude.contains("-")){
                                    start = start.substring(0, 1) + "-" + start.substring(2, start.length());
                                    break;
                                }
                            case 2:
                                if(!exclude.contains("*")){
                                    start = start.substring(0, 1) + "*" + start.substring(2, start.length());
                                    break;
                                }
                            case 3:
                                if(!exclude.contains("/")){
                                    start = start.substring(0, 1) + "/" + start.substring(2, start.length());
                                    break;
                                }
                        }
                        for(int f = 0; f < 4; f++){
                            switch (f) {
                                case 0:
                                    if(!exclude.contains("+")){
                                        start = start.substring(0, 3) + "+" + start.substring(4, start.length());
                                        break;
                                    }
                                case 1:
                                    if(!exclude.contains("-")){
                                        start = start.substring(0, 3) + "-" + start.substring(4, start.length());
                                        break;
                                    }
                                case 2:
                                    if(!exclude.contains("*")){
                                        start = start.substring(0, 3) + "*" + start.substring(4, start.length());
                                        break;
                                    }
                                case 3:
                                    if(!exclude.contains("/")){
                                        start = start.substring(0, 3) + "/" + start.substring(4, start.length());
                                        break;
                                    }
                            }
                            for(int g = 0; g < 4; g++){
                                switch (g) {
                                    case 0:
                                        if(!exclude.contains("+")){
                                            start = start.substring(0, 5) + "+" + start.substring(6, start.length());
                                            break;
                                        }
                                    case 1:
                                        if(!exclude.contains("-")){
                                            start = start.substring(0, 5) + "-" + start.substring(6, start.length());
                                            break;
                                        }
                                    case 2:
                                        if(!exclude.contains("*")){
                                            start = start.substring(0, 5) + "*" + start.substring(6, start.length());
                                            break;
                                        }
                                    case 3:
                                        if(!exclude.contains("/")){
                                            start = start.substring(0, 5) + "/" + start.substring(6, start.length());
                                            break;
                                        }
                                }
                                for(int h = 0; h < 8; h++){
                                    switch (h) {
                                        case 0:
                                            break;
                                        case 1:
                                            if(!exclude.contains("X")){
                                                start = "(" + start.substring(0, 3) + ")" + start.substring(3, 4) + "(" + start.substring(4, 7) + ")";
                                                break;
                                            }
                                        case 2:
                                            if(!exclude.contains("X")){
                                                start = start.substring(0, 6) + start.substring(7, 10);
                                                break;
                                            }
                                        case 3:
                                            if(!exclude.contains("X")){
                                                start = start.substring(1, 4) + start.substring(5, 6) + "(" + start.substring(6, 9) + ")";
                                                break;
                                            }
                                        case 4:
                                            if(!exclude.contains("X")){
                                                start = start.substring(0, 2) + "(" + start.substring(2, 4) + start.substring(5, 6) + ")" + start.substring(6, 8);
                                                break;
                                            }
                                        case 5:
                                            if(!exclude.contains("X")){
                                                start = start.substring(0, 6) + start.substring(7, 9) + ")";
                                                break;
                                            }
                                        case 6:
                                            if(!exclude.contains("X")){
                                                start = "(" + start.substring(0, 2) + start.substring(3, 6) + ")" + start.substring(6, 8);
                                                break;
                                            }
                                        case 7:
                                            if(!exclude.contains("X")){
                                                start = start.substring(1, 6) + start.substring(7, 9);
                                                break;
                                            }
                                    }
                                    String sol = p.eval(start).toString();
                                    if(sol.contains("NaN") || sol.contains("Infinity")){
                                        sol = "0";
                                    }
                                    double sol2 = Double.parseDouble(sol);
                                    if(sol2 == 10){
                                        String r = rrb(start);
                                        if(!sols.contains(r)){
                                            count++;
                                            sols.add(start);
                                            System.out.println("Solution Found --> [ " + start + " ]");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Found " + count + "/8192 solutions in " + ((System.nanoTime()-t1)/1000000) + "ms.");
        }else{
            System.out.println("Missing Arguments! Correct usage: FourEQten ABCD [OPTIONAL: Exclude operators: +-*/X]");
        }
    }
}
