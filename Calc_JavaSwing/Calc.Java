package SwingCalc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calc {
    public static void main(String[] args) {
        calc_page obj_calc=new calc_page();
        obj_calc.setVisible(true);
    }
}
class calc_page extends JFrame implements ActionListener{
    
    JTextField num1,num2,result;
    JButton Add,Sub,Mul,Div;
    JLabel title;
     
        // int first=Integer.parseInt(num1.getText());
        // int second=Integer.parseInt(num2.getText());
    
    public calc_page()
    {
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 500);
        title=new JLabel("---------CALCULATOR---------");
        num1=new JTextField(15);
        num2=new JTextField(15);
        result=new JTextField("Answer");
        Add=new JButton("+");
        Sub=new JButton("-");
        Mul=new JButton("X");
        Div=new JButton("/");

        add(title);
        add(num1);
        add(num2);
        add(result);
        add(Add);add(Sub);add(Mul);add(Div); 
        Add.addActionListener(this); 
        Sub.addActionListener(this);
        Mul.addActionListener(this);
        Div.addActionListener(this);
            
        }    
    
    public void actionPerformed(ActionEvent e){
        
        int first=Integer.parseInt(num1.getText());
        int second=Integer.parseInt(num2.getText());
       try{
        if(Add.equals(e.getSource())){
             int addedValue=first+second;
             result.setText(String.valueOf(addedValue+""));
        }else if(Sub.equals(e.getSource())){
            int SubValue=first-second;
            result.setText(String.valueOf(SubValue+""));
        }else if(Mul.equals(e.getSource())){
            int MulValue=first*second;
            result.setText(String.valueOf(MulValue+""));
        }else if(Div.equals(e.getSource())){
            if(second!=0 && first>second){
            int DivValue=first/second;
            result.setText(String.valueOf(DivValue+""));}else{System.err.println("problem with your number....");}
        }
        }catch(Exception exp){System.out.println(exp);System.err.println("program has some intruption in action performed class");
    }
        }
        
    }

