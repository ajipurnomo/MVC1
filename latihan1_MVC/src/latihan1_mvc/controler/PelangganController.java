/*
NIM     : 10117073
NAMA    : AJI PURNOMO
Kelas   : IF 2
 */
package latihan1_mvc.controler;
import javax.swing.JOptionPane;
import latihan1_mvc.model.PelangganModel;
import latihan1_mvc.view.PelangganView;

public class PelangganController {
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetForm(PelangganView view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();      
        if (nama.equals("") && email.equals("") && noTlp.equals("")){
            
        }else
            model.resetForm();              
    }
    
    public void simpanForm(PelangganView view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();    
        if (nama.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        }else if(email.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        }else if(noTlp.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nomor Telepon Masih Kosong");
        }else{
            model.simpanForm();
        }
            
    }
}
