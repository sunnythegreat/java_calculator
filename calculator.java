import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

public class calculator {
    private JTextField txt_field;
    private JButton btn_7;
    private JButton btn_4;
    private JButton btn_8;
    private JButton btn_5;
    private JButton btn_9;
    private JButton btn_6;
    private JButton btn_mul;
    private JButton btn_sub;
    private JButton btn_2;
    private JButton btn_3;
    private JButton btn_add;
    private JButton btn_0;
    private JButton btn_dot;
    private JButton btn_equal;
    private JButton btn_1;
    private JButton btn_back;
    private JButton btn_clear;
    private JButton btn_mod;
    private JButton btn_divide;
    private JPanel Main;


    public static void main(String[] args) {
        JFrame frame = new JFrame("calculator");
        frame.setContentPane(new calculator().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public calculator() {
        btn_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(txt_field.getText().length()>0) {
                    String number = txt_field.getText() + btn_0.getText();
                    txt_field.setText(number);
                }

            }
        });
        btn_dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String st=txt_field.getText();
                int len=st.length();
                int flag=0;
                for(int i=0;i<len;i++){
                    if(st.charAt(i)=='.'){
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    txt_field.setText(st+btn_dot.getText());
                }

            }
        });
        btn_equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String st=txt_field.getText();
                int len=st.length();
                String left="";
                String right="";
                int op=0;
                int flag=0;
                for(int i=0;i<len;i++){
                    if(flag==1){
                        right+=st.charAt(i);
                    }
                    if(st.charAt(i)=='+'||st.charAt(i)=='-'||st.charAt(i)=='*'||st.charAt(i)=='/'||st.charAt(i)=='%'){
                        if(st.charAt(i)=='+'){
                            op=1;
                        }
                        if(st.charAt(i)=='-'){
                            op=2;
                        }
                        if(st.charAt(i)=='*'){
                            op=3;
                        }
                        if(st.charAt(i)=='/'){
                            op=4;
                        }
                        if(st.charAt(i)=='%'){
                            op=5;
                        }
                        flag=1;
                    }

                    if(flag==0){
                        left+=st.charAt(i);
                    }

                }
                double a=Double.parseDouble(left);
                double b=Double.parseDouble(right);
                switch (op){
                    case 1:{
                        txt_field.setText(String.valueOf(a+b));
                        break;
                    }
                    case 2:{
                        txt_field.setText(String.valueOf(a-b));
                        break;
                    }
                    case 3:{
                        txt_field.setText(String.valueOf(a*b));
                        break;
                    }
                    case 4:{
                        txt_field.setText(String.valueOf(a/b));
                        break;
                    }
                    case 5:{
                        txt_field.setText(String.valueOf(a%b));
                        break;
                    }
                    default:{

                    }
                }
            }
        });
        btn_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String st=txt_field.getText();
                int len=st.length();
                HashSet<Character> hs=new HashSet<>();
                for(int i=0;i<len;i++){
                    hs.add(st.charAt(i));
                }
                if(!(hs.contains('+')||hs.contains('-')||hs.contains('*')||hs.contains('/')||hs.contains('%'))){
                    st+=btn_add.getText();
                    txt_field.setText(st);
                }

            }
        });
        btn_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String number=txt_field.getText()+btn_3.getText();
                txt_field.setText(number);
            }
        });
        btn_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String number=txt_field.getText()+btn_2.getText();
                txt_field.setText(number);
            }
        });
        btn_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String number=txt_field.getText()+btn_1.getText();
                txt_field.setText(number);
            }
        });
        btn_sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String st=txt_field.getText();
                int len=st.length();
                HashSet<Character> hs=new HashSet<>();
                for(int i=0;i<len;i++){
                    hs.add(st.charAt(i));
                }
                if(!(hs.contains('+')||hs.contains('-')||hs.contains('*')||hs.contains('/')||hs.contains('%'))){
                    st+=btn_sub.getText();
                    txt_field.setText(st);
                }
            }
        });
        btn_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String number=txt_field.getText()+btn_6.getText();
                txt_field.setText(number);
            }
        });
        btn_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String number=txt_field.getText()+btn_5.getText();
                txt_field.setText(number);
            }
        });
        btn_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String number=txt_field.getText()+btn_4.getText();
                txt_field.setText(number);
            }
        });
        btn_mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String st=txt_field.getText();
                int len=st.length();
                HashSet<Character> hs=new HashSet<>();
                for(int i=0;i<len;i++){
                    hs.add(st.charAt(i));
                }
                if(!(hs.contains('+')||hs.contains('-')||hs.contains('*')||hs.contains('/')||hs.contains('%'))){
                    st+=btn_mul.getText();
                    txt_field.setText(st);
                }
            }
        });
        btn_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String number=txt_field.getText()+btn_9.getText();
                txt_field.setText(number);
            }
        });
        btn_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String number=txt_field.getText()+btn_8.getText();
                txt_field.setText(number);
            }
        });
        btn_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String number=txt_field.getText()+btn_7.getText();
                txt_field.setText(number);
            }
        });
        btn_divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String st=txt_field.getText();
                int len=st.length();
                HashSet<Character> hs=new HashSet<>();
                for(int i=0;i<len;i++){
                    hs.add(st.charAt(i));
                }
                if(!(hs.contains('+')||hs.contains('-')||hs.contains('*')||hs.contains('/')||hs.contains('%'))){
                    st+=btn_divide.getText();
                    txt_field.setText(st);
                }
            }
        });
        btn_mod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String st=txt_field.getText();
                int len=st.length();
                HashSet<Character> hs=new HashSet<>();
                for(int i=0;i<len;i++){
                    hs.add(st.charAt(i));
                }
                if(!(hs.contains('+')||hs.contains('-')||hs.contains('*')||hs.contains('/')||hs.contains('%'))){
                    st+=btn_mod.getText();
                    txt_field.setText(st);
                }
            }
        });
        btn_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txt_field.setText("");
            }
        });
        btn_back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String st=txt_field.getText();
                if(st.length()>0){
                    txt_field.setText(st.substring(0,st.length()-1));
                }
            }
        });
    }
}
