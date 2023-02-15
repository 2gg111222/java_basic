package 생성자맛보기;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class 음식주문정보시스템 {
public static void main(String[] args) {
JFrame f = new JFrame();
f.setTitle("음식주문시스템");
f.setSize(600, 500);
f.getContentPane().setBackground(Color.green);

FlowLayout flow = new FlowLayout();
f.setLayout(flow);

JButton b1 = new JButton("짬뽕");
JButton b2 = new JButton("우동");
JButton b3 = new JButton("짜장");
Font font = new Font("궁서", Font.ITALIC, 30);
b1.setFont(font);
b2.setFont(font);
b3.setFont(font);

JLabel textLabel = new JLabel("개수: ");
textLabel.setFont(font);
JLabel countLabel = new JLabel("0개");
countLabel.setFont(font);
JLabel imgLabel = new JLabel();
ImageIcon icon = new ImageIcon("home.png");
imgLabel.setIcon(icon);
JLabel result = new JLabel("결제금액 0원");
result.setFont(font);


f.add(b1);
f.add(b2);
f.add(b3);
f.add(textLabel);
f.add(countLabel);
f.add(imgLabel);
f.add(result);



f.setVisible(true);
}
}