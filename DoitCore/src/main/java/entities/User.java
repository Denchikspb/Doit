package entities;

// REVIEW DATE: 11.08.2015
// REVIEWER: ALMAZ

/**
 * ���������� � ������������
 * @author Anatoly
 */
public class User {
    /** ��� */
    private String name;
    /** ������ */
    private String pass;
    /** E-mail */
    private String e_mail;

    /**
     * ��������� �������� ���������� � ������������
     * @param pass ������
     * @param name ���
     * @param e_mail E-mail
     */
    public User(String pass, String name, String e_mail) {
        this.name = name;
        this.pass = pass;
        this.e_mail = e_mail;
    }
    
    /**
     * �������������� ���������� � ������������
     */
    public void editUser(){
        
    }
}
