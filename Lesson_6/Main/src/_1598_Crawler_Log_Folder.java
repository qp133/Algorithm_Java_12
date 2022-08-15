import java.util.Arrays;

public class _1598_Crawler_Log_Folder {
    public static int minOperations(String[] logs) {
        int step = 0;
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("../")) {
                if (step > 0) {
                    step -= 1;
                }
            } else if (!logs[i].equals("../") && !logs[i].equals("./")) {
                step += 1;
            }
        }
        System.out.println("step: " + step);
        return step;
    }

    //Cách 2:
    public static int minOperations2(String[] logs) {
        int n = 0;
        for(String s : logs){
            if(s.equals("."))
                continue;
            if(s.equals("../")){
                n = Math.max(0,n-1);
            }else{
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","../","d21/","./"};
        minOperations(logs);
    }
}
