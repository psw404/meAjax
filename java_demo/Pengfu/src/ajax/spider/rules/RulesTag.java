package ajax.spider.rules;

public enum RulesTag {

	ZHIHU_ANSWER(1, "ajax.spider.rules.ZhihuAnswerRules", "");
	
	private int id;
	private String className;
	private String info;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	private RulesTag(int id, String className, String info) {
		this.id = id;
		this.className = className;
		this.info = info;
	}
	
	public static RulesTag getRulesTagById(int id) {
		RulesTag[] tags = RulesTag.values();
		
		for (RulesTag tag : tags) {
			if (tag.getId() == id) {
				return tag;
			}
		}
		return null;
	}
	
	
	
}
