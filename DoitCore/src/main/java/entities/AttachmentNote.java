/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;


// REVIEW DATE: 11.08.2015
// REVIEWER: ALMAZ


/**
 * ������������ ��� �������� � ������ � ������������� ���� Note
 * ����������� �� {@link Attachment}
 * @author Anatoly
 */
public class AttachmentNote extends Attachment {
    /**
     * ������ Note, ��� �������� �������
     */
    private Object Note;

    /**
     * �������������� ���� {@link AttachmentNote#name}
     * @param name 
     * @see AttachmentNode
     */
    public AttachmentNote(String name) {
        super(name);
        editNote();
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
    
    /**
     * �������������� �������
     */
    public final void editNote(){
        
    }
}
