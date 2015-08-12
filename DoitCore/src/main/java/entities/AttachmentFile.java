/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

// REVIEW DATE: 11.08.2015
// REVIEWER: ALMAZ


/**
 * ������������ ��� �������� � ������ � ������������� ���� File
 * ����������� �� {@link Attachment}
 * @author Anatoly
 */
public class AttachmentFile extends Attachment {
    /**
     * ������ �� ����
     */
    private Object filePath;

    /**
     * �������������� ���� {@link AttachmentFile#name} � {@link AttachmentFile#filePath}
     * @param name ��� ������������
     * @param file ������ �� ����-������������
     * @see AttachmentFile
     */
    public AttachmentFile(String name, Object file) {
        super(name);
        filePath = file;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void editAttachment() {
        
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteAttachment(){
        
    }
    
}
