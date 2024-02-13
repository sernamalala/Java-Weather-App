import javax.swing.*;
import java.awt.*;

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

        addGUIComponents();
    }

    public void addGUIComponents(){
        //GUI components that will be visible on the screen
        //search bar
        JTextField searchBar = new JTextField();

        //set where the component will be located
        searchBar.setBounds(15,15,351,45);

        //change font
        searchBar.setFont(new Font("Dialog", Font.PLAIN, 24));

        //add searchBar so that its visible
        add(searchBar);
    }
}
