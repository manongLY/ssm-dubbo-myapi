package cn.mldn.joy.service.back;

import java.util.Map;

import cn.mldn.joy.vo.ReplyLog;

public interface ILogServiceBack {
	public Map<String,Object> listReplayLog(Map<String,Object> param) ;
	public ReplyLog showReplayLog(String id) ;
}
    