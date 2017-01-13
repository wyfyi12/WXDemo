package com.util;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class dojson {
	public JSONObject getJSONObjectfromString(String str) {
		JSONObject myJsonObject = new JSONObject();
		myJsonObject = JSONObject.fromObject(str);
		return myJsonObject;
	}

	public JSONArray getJSONArrayfromJSONObject(String str, String str1) {
		JSONObject jsonObjSplit = new JSONObject();
		jsonObjSplit = JSONObject.fromObject(str);
		JSONArray ja = jsonObjSplit.getJSONArray(str1);
		return ja;
	}

	public JSONObject getJSONObject(JSONArray ja, int i) {
		JSONObject jo = (JSONObject) ja.get(i);
		return jo;
	}
	
	public JSONObject gettxtjob(int agentid,String msgtype,String touser,String content){
		JSONObject txtjob=new JSONObject();
		txtjob.element("agentid", agentid);
		txtjob.element("msgtype", msgtype);
		txtjob.element("touser", touser);
		JSONObject tjob=new JSONObject();
		tjob.element("content", content);
		txtjob.element("text", tjob);
		return txtjob;
	}
}
