import java.awt.*;
import java.awt.event.*;

public class EmployeeInfoForm extends Frame implements ActionListener {
    TextField name, id, department;
    Label resultLabel;

    public EmployeeInfoForm() {
        setTitle("Employee Information Form");
        setSize(400, 300);
        setLayout(new GridLayout(5,2));
        
        // Labels and TextFields
        add(new Label("Name:"));
        name = new TextField(20);
        add(name);
        
        add(new Label("Employee ID:"));
        id = new TextField(10);
        add(id);
        
        add(new Label("Department:"));
        department = new TextField(15);
        add(department);
        // Submit Button
        Button submitButton = new Button("Submit");
        submitButton.addActionListener(this);
        add(submitButton);
        
        // Result Label
        resultLabel = new Label();
        add(resultLabel);
        
        // Close Window on Exit
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = this.name.getText();
        String empID = this.id.getText();
        String department = this.department.getText();
        resultLabel.setText("Employee: " + name + ", ID: " + empID + ", Dept: " + department);
    }

    public static void main(String[] args) {
        new EmployeeInfoForm();
    }
}