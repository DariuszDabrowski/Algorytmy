package Algorithm;

import java.util.Stack;

/**
 * Created by RENT on 2017-08-03.
 */
public class ONP extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "ONP";
    }

    @Override
    public void runAlgoritm(String[] input) {
        Stack<Integer> st = new Stack();
        int e;
        int v1=0;
        int v2=0;

        for (int i = 1; i < input.length; i++) {

            switch(input[i]) {
                case "D":
                    v1 = st.pop();
                    v2 = st.pop();
                    e = v1+v2;
                    st.push(e);
                    break;
                case "O":
                    v1 = st.pop();
                    v2 = st.pop();
                    e = v1-v2;
                    st.push(e);
                    break;
                case "M":
                    v1 = st.pop();
                    v2 = st.pop();
                    e = v1 * v2;
                    st.push(e);
                    break;
                case "I":
                    v1 = st.pop();
                    v2 = st.pop();
                    
                        e = v1 / v2;
                        st.push(e);

                    break;
                case "R":
                    System.out.printf("%d ", st.pop());
                    break;
                default:
                    e = Integer.parseInt(input[i]);
                    st.push(e);
                    break;
            }

        }

    }
}
