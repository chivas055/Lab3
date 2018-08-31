import javax.swing.*;

public class Main {
    public static void main(String [] args){

//        String input = JOptionPane.showInputDialog("ใส่ตัวเลข 1 ตัว", "0");
//       JOptionPane.showMessageDialog(null, input, "title", JOptionPane.INFORMATION_MESSAGE);
        int ans = JOptionPane.showConfirmDialog(null
                , "ง่วงนอน"
                , "ถามจริง", JOptionPane.YES_NO_OPTION);
        if(ans == JOptionPane.YES_NO_OPTION){
            JOptionPane.showMessageDialog(null, "กลับไปนอน!!");
        }else{
            JOptionPane.showMessageDialog(null, "จริงเหรอ?");
        }
    }
}
