/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;


// REVIEW DATE: 11.08.2015
// REVIEWER: ALMAZ


/**
 * ����������� �����, ��������� ����� ���� � ������ ��� ������ � ��������������
 * @author Anatoly
 */
public abstract class Attachment {
    /**
     * ��� ������������
     */
    protected String name;

    /**
     * �������������� ���� {@link Attachment#name}
     * @param name ��� ������������
     * @see Attachment
     */
    protected Attachment(String name) {
        setName(name);
    }

    /**
     * �������������� ������������
     */
    public void editAttachment() {
        
    }
    
    /**
     * �������� ������������
     */
    public void deleteAttachment(){
        
    }
    
    /**
     * ���������� ��� ������������
     * @return ��� ������������
     */
    public final String getName(){
        return name;
    }
    
    /**
     * ��������� ������ ��� ������������
     * @param nameString ����� ��� ������������
     */
    public final void setName(String nameString){
        this.name = nameString;
    }
}

