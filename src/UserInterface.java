import javax.swing.*;

//imagine JFrame class was there
//inherit
public class UserInterface extends JFrame {
//constructor
    public UserInterface(){
        super("Weather App");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //size of GUI
        setSize(450,650);
        //center GUI
        setLocationRelativeTo(null);
        //makes it possible for us to set width and height as we want
        setLayout(null);
        //prevent resize
        setResizable(false);
    }
}
