import java.io.*;
import java.util.*;

public class MeasuringTraffic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("traffic.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("traffic.out")));
        int n = Integer.parseInt(br.readLine());
        String[] types = new String[n];
        int[] low = new int[n];
        int[] high = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            types[i] = st.nextToken();
            low[i] = Integer.parseInt(st.nextToken());
            high[i] = Integer.parseInt(st.nextToken());
        }
        int minFlow = 0, maxFlow = 1000;
        for (int i = n - 1; i >= 0; i--) {
            if (types[i].equals("none")) {
                minFlow = Math.max(minFlow, low[i]);
                maxFlow = Math.min(maxFlow, high[i]);
            } else if (types[i].equals("on")) {
                minFlow -= high[i];
                maxFlow -= low[i];
                minFlow = Math.max(0, minFlow);
            } else if (types[i].equals("off")) {
                minFlow += low[i];
                maxFlow += high[i];
            }
        }
        pw.println(minFlow + " " + maxFlow);
        minFlow = 0;
        maxFlow = 1000;
        for (int i = 0; i < n; i++) {
            if (types[i].equals("none")) {
                minFlow = Math.max(minFlow, low[i]);
                maxFlow = Math.min(maxFlow, high[i]);
            } else if (types[i].equals("on")) {
                minFlow += low[i];
                maxFlow += high[i];
            } else if (types[i].equals("off")) {
                minFlow -= high[i];
                maxFlow -= low[i];
                minFlow = Math.max(0, minFlow);
            }
        }
        pw.println(minFlow + " " + maxFlow);
        pw.close();
        br.close();
    }
}


/*import java.util.*;
import java.io.*;

public class MeasuringTraffic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("traffic.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("traffic.out")));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Ramps> arr = new ArrayList<Ramps>();
        for(int i=0; i<n; i++) {
            String[] x = br.readLine().split(" ");
            arr.add(new Ramps(x[0], Integer.parseInt(x[1]), Integer.parseInt(x[2])));
        }

        int[] limits = new int[4];
        int start=-1;
        for(int i=0; i<arr.size(); i++) {
            if(arr.get(i).getType().equals("none")) {
                limits[0] = arr.get(i).getLower();
                limits[2] = arr.get(i).getLower();
                limits[1] = arr.get(i).getUpper();
                limits[3] = arr.get(i).getUpper();
                start = i;
                break;
            }
        }

        for(int i=start+1; i<arr.size(); i++) {
            if(arr.get(i).getType().equals("none")) {
                limits[2] = Math.max(limits[2], arr.get(i).getLower());
                limits[3] = Math.min(limits[3], arr.get(i).getUpper());
            } else if(arr.get(i).getType().equals("on")) {
                limits[2] += arr.get(i).getLower();
                limits[3] += arr.get(i).getUpper();
            } else if(arr.get(i).getType().equals("off")) {
                limits[2] -= arr.get(i).getLower();
                limits[3] -= arr.get(i).getUpper();
            }
        }

        for(int i=arr.size()-1; i>=0; i++) {
            if(arr.get(i).getType().equals("none")) {
                limits[0] = Math.max(limits[0], arr.get(i).getLower());
                limits[1] = Math.min(limits[1], arr.get(i).getUpper());
            } else if(arr.get(i).getType().equals("on")) {
                limits[0] -= arr.get(i).getLower();
                limits[1] -= arr.get(i).getUpper();
            } else if(arr.get(i).getType().equals("off")) {
                limits[0] += arr.get(i).getLower();
                limits[1] += arr.get(i).getUpper();
            }
        }

        for(int i=0; i<arr.size(); i++) {
            if(arr.get(i).getType().equals("none")) {
                limits[2] = Math.max(limits[2], arr.get(i).getLower());
                limits[3] = Math.min(limits[3], arr.get(i).getUpper());
            } else if(arr.get(i).getType().equals("on")) {
                limits[2] += arr.get(i).getLower();
                limits[3] += arr.get(i).getUpper();
            } else if(arr.get(i).getType().equals("off")) {
                limits[2] -= arr.get(i).getLower();
                limits[3] -= arr.get(i).getUpper();
            }
        }

        pw.println(limits[0] + " " + limits[1] + "\n" + limits[2] + " " + limits[3]);

        br.close();
        pw.close();
    }
}

public class Ramps {
    private String type;
    private int lower;
    private int upper;

    public Ramps(String s, int l, int u) {
        type = s;
        lower = l;
        upper = u;
    }

    public int getLower() {
        return lower;
    }

    public int getUpper() {
        return upper;
    }

    public String getType() {
        return type;
    }
}
*/