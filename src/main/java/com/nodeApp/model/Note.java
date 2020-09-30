package com.nodeApp.model;

public class Note {
    private String affair;
    private String description;

    /**
     *
     * @param affair asunto de las notas
     * @param description descripcion de la nota
     */
    public Note(String affair, String description){
        this.affair = affair;
        this.description = description;
    }

    /**
     *
     * @return Asunto de la nota
     */
    public String getAffair() {
        return affair;
    }

    /**
     * Actualiza el asunto de la nota
     * @param affair nuevo asunto de la nota
     */
    public void setAffair(String affair) {
        this.affair = affair;
    }

    /**
     *
     * @return descripcion de la nota
     */
    public String getDescription() {
        return description;
    }

    /**
     * Actualiza la descripcion de la nota
     * @param description nueva descripcion
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
