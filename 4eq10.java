import javax.script.ScriptEngineManager;

import java.util.ArrayList;

import javax.script.ScriptEngine;
import javax.script.ScriptException;

class FourEQten {
    public static void main(String[] args) throws ScriptException {
        ArrayList solutionList = new ArrayList<>();
        solutionList.clear();

        String excludeARGS = null;
        String[] excludeARRAY = null;
        String exclude = null;
        String startARGS = null;
        String[] startARRAY = null;
        String start = null;
        if(args.length < 1){
           //no args
        }else if(args.length == 1){
            //normal
            startARGS = args[0];
            startARRAY = startARGS.split("::");
            start = startARRAY[0] + "#" + startARRAY[1] + "#" + startARRAY[2] + "#" + startARRAY[3];
        }else if(args.length > 1){
            //exclude
            startARGS = args[0];
            startARRAY = startARGS.split("::");
            start = startARRAY[0] + "#" + startARRAY[1] + "#" + startARRAY[2] + "#" + startARRAY[3];
            excludeARGS = args[1];
            excludeARRAY = excludeARGS.split("::");
            exclude = "";
            for(int i = 0; i < excludeARRAY.length; i++){
                exclude = exclude + excludeARRAY[i] + " ";
            }
        }
        
        if(exclude == null){
            exclude = "";
        }
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        if(start != null){
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
                                            if(!exclude.contains("§")){
                                                start = "(" + start.substring(0, 3) + ")" + start.substring(3, 4) + "(" + start.substring(4, 7) + ")";
                                                break;
                                            }
                                        case 2:
                                            if(!exclude.contains("§")){
                                                start = start.substring(0, 6) + start.substring(7, 10);
                                                break;
                                            }
                                        case 3:
                                            if(!exclude.contains("§")){
                                                start = start.substring(1, 4) + start.substring(5, 6) + "(" + start.substring(6, 9) + ")";
                                                break;
                                            }
                                        case 4:
                                            if(!exclude.contains("§")){
                                                start = start.substring(0, 2) + "(" + start.substring(2, 4) + start.substring(5, 6) + ")" + start.substring(6, 8);
                                                break;
                                            }
                                        case 5:
                                            if(!exclude.contains("§")){
                                                start = start.substring(0, 6) + start.substring(7, 9) + ")";
                                                break;
                                            }
                                        case 6:
                                            if(!exclude.contains("§")){
                                                start = "(" + start.substring(0, 2) + start.substring(3, 6) + ")" + start.substring(6, 8);
                                                break;
                                            }
                                        case 7:
                                            if(!exclude.contains("§")){
                                                start = start.substring(1, 6) + start.substring(7, 9);
                                                break;
                                            }
                                    }
                                    String sol = engine.eval(start).toString();
                                    if(sol.contains("NaN") || sol.contains("Infinity")){
                                        sol = "0";
                                    }
                                    Double solutuo = Double.parseDouble(sol);
                                    if(solutuo == 10){
                                        if(!solutionList.contains(start)){
                                            solutionList.add(start);
                                            System.out.println("SOLUTION FOUND [ " + start + " ]");
                                        }
                                    }
                                }
                            }
                        }
                    }
                } 
            }
        }else{
            System.out.println("Missing Arguments! Correct usage: FourEQten A::B::C::D [OPTIONAL: Exclude operators: +::-::*::/::§]");
        }
    }
}