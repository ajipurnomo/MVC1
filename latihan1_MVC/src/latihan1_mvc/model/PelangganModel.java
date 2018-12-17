/*
NIM     : 10117073
NAMA    : AJI PURNOMO
Kelas   : IF 2
 */
package latihan1_mvc.model;

import javax.swing.JOptionPane;
import latihan1_mvc.event.PelangganListener;

public class PelangganModel {
    private String nama;
    private String email;
    private String noTelp;
    
    private PelangganListener pelanganListener;

    public PelangganListener getPelanganListener() {
        return pelanganListener;
    }

    public void setPelanganListener(PelangganListener pelanganListener) {
        this.pelanganListener = pelanganListener;
    }
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if (pelanganListener != null){
            pelanganListener.onChange(this);
        }
    }
    
    
    public void resetForm(){
        setNama("");
        setEmail("");
        setNoTelp("");
    }
    public void simpanForm(){
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        resetForm();
    }
    
    
    
}
