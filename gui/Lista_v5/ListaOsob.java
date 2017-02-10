package listy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.*;

public class ListaOsob extends JFrame implements ActionListener {
	
	JTextField imie, nazwisko;
	DefaultListModel<String> modelListy;
	DefaultTableModel modelTabeli;
	
	public ListaOsob(String title) {
		super(title);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		imie = new JTextField("", 10);
		imie.setBorder(BorderFactory.createTitledBorder("Imię"));
		nazwisko = new JTextField("", 10);
		nazwisko.setBorder(BorderFactory.createTitledBorder("Nazwisko"));
		
        JPanel p1 = new JPanel();        
        p1.add(imie);
        p1.add(nazwisko);
        
        JPanel p2 = new JPanel();
        
        JButton dodaj1 = new JButton("Dodaj do listy");        
        dodaj1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Dodaj1 - " + imie.getText());
				String noweImie = imie.getText();
				if(noweImie != ""){
					modelListy.addElement(noweImie);
					imie.setText("");
				}
			}        	
        });
        
        JButton dodaj2 = new JButton("Dodaj do tabeli");
        dodaj2.addActionListener(this);
        
        p2.add(dodaj1);
        p2.add(dodaj2);

//		wersja statyczna listy
//        String[] elementyListy = {"Ala", "Ola", "Ula"}; 
//        lista = new JList<String>(elementyListy);
        
        modelListy = new DefaultListModel<String>();
        modelListy.addElement("Achacy");
        modelListy.addElement("Bonifacy");
        modelListy.addElement("Cezary");

        JList<String> lista = new JList<String>(modelListy);
        JScrollPane sl = new JScrollPane(lista);
		sl.setPreferredSize(new Dimension(150, 150));
		sl.setBorder(BorderFactory.createTitledBorder("Lista"));
        
		String[] kolumnyTabeli = {"Nr", "Imie", "Nazwisko", "Obecna" };
		modelTabeli = new DefaultTableModel(kolumnyTabeli,0){
			public boolean isCellEditable(int row, int col){ 
				if(col == 0) return false; else return true; 
	        }
			public Class getColumnClass(int c) {
		        return getValueAt(0, c).getClass();
		    }
		};
		JTable tabela = new JTable(modelTabeli);
		
		//modelTabeli.addRow( new Object[]{ 1, "John", "Rambo"} );
        
		JScrollPane st = new JScrollPane(tabela);
		st.setPreferredSize(new Dimension(300, 150));
		st.setBorder(BorderFactory.createTitledBorder("Tabela"));
		
		JPanel p3 = new JPanel();
        p3.add(sl);
        p3.add(st);

		setLayout(new BorderLayout());
        add(p1, BorderLayout.PAGE_START);
        add(p2, BorderLayout.PAGE_END);
        add(p3, BorderLayout.CENTER);
        
        setPreferredSize(new Dimension(500, 300));   	 
        pack();
        setVisible(true);	
    }
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	new ListaOsob("Lista i tablica osób");
            }
        });
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("Dodaj2 - " + imie.getText() + " " + nazwisko.getText());
		String noweImie = imie.getText();
		String noweNazwisko = nazwisko.getText();
		if(noweImie != "" && noweNazwisko != ""){
			int ile = modelTabeli.getRowCount();
			modelTabeli.addRow( new Object[]{ ile+1, noweImie, noweNazwisko, true });
		}
	}
}
