package com.xoriant.casestudy3.entities;

public class Topic {
	private String topicName;

	public Topic(String topicName) {
		super();
		this.topicName = topicName;
	}

	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	@Override
	public String toString() {
		return "Topic [" + (topicName != null ? "topicName=" + topicName : "") + "]";
	}

}
