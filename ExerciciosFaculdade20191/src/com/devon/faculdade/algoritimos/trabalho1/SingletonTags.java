package com.devon.faculdade.algoritimos.trabalho1;

public enum SingletonTags {
	
	META("<meta"),
	BASE("<base"),
	BR("<br"),
	COL("<col"),
	COMMAND("<command"),
	EMBED("<embed"),
	HR("<hr"),
	IMG("<img"),
	INPUT("<input"),
	LINK("<link"),
	PARAM("<param"),
	SOURCE("<source"),
	DOCTYPE("<!DOCTYPE");
	
	public String tag;

	SingletonTags(String tag) {
		this.tag = tag;
	}
	
}
