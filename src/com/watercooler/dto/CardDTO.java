package com.watercooler.dto;

import java.io.Serializable;
import java.util.HashMap;

public class CardDTO implements Serializable {

	private String description;
	private String id;
	private String dataseturl;
	private String rcommands;
	private boolean isVisual;
	private HashMap<String, Object> parameters;
	private String imageurl;

	
	
	
	
	public CardDTO(String description, String id, String dataseturl,
			String rcommands, boolean isVisual,
			HashMap<String, Object> parameters) {
		super();
		this.description = description;
		this.id = id;
		this.dataseturl = dataseturl;
		this.rcommands = rcommands;
		this.isVisual = isVisual;
		this.parameters = parameters;
		this.imageurl = imageurl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDataseturl() {
		return dataseturl;
	}

	public void setDataseturl(String dataseturl) {
		this.dataseturl = dataseturl;
	}

	public String getRcommands() {
		return rcommands;
	}

	public void setRcommands(String rcommands) {
		this.rcommands = rcommands;
	}

	public boolean isVisual() {
		return isVisual;
	}

	public void setVisual(boolean isVisual) {
		this.isVisual = isVisual;
	}

	public HashMap<String, Object> getParameters() {
		return parameters;
	}

	public void setParameters(HashMap<String, Object> parameters) {
		this.parameters = parameters;
	}
	

	@Override
	public String toString() {
		return "CardsDTO [description=" + description + ", id=" + id
				+ ", dataseturl=" + dataseturl + ", rcommands=" + rcommands
				+ ", isVisual=" + isVisual + ", parameters=" + parameters + "]";
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	
	

}
