package hb.page;

import java.util.HashMap;   
import java.util.List;   
import java.util.Map;   
    
/**  
 * 对分页的基本数据进行一个简单的封装  
 */  
public class Page<T> {   
    
    //private int page = 1;//页码，默认是第一页   
    //private int rows = 15;//每页显示的记录数，默认是15
	private int page = 1;//页码，默认是第一页   
	private int rows = 3;//每页显示的记录数，默认是15
    private int totalRecord;//总记录数   
    private int totalPage;//总页数 
    private List<T> results;//对应的当前页记录
    private Map<String, Object> params = new HashMap<String, Object>();//其他的参数我们把它分装成一个Map对象   
    
    /*public int getPageNo() {   
       return page;   
    }   
    
    public void setPageNo(int page) {   
       this.page = page;   
    }   
    
    public int getPageSize() {   
       return rows;   
    }   
    
    public void setPageSize(int rows) {   
       this.rows = rows;   
    } */  
    
    public int getTotalRecord() {   
       return totalRecord;   
    }   
    
    public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public void setTotalRecord(int totalRecord) {   
       this.totalRecord = totalRecord;   
       //在设置总页数的时候计算出对应的总页数，在下面的三目运算中加法拥有更高的优先级，所以最后可以不加括号。   
       int totalPage = totalRecord%rows==0 ? totalRecord/rows : totalRecord/rows + 1;   
       this.setTotalPage(totalPage);   
    }   
    
    public int getTotalPage() {   
       return totalPage;   
    }   
    
    public void setTotalPage(int totalPage) {   
       this.totalPage = totalPage;   
    }   
    
    public List<T> getResults() {   
       return results;   
    }   
    
    public void setResults(List<T> results) {   
       this.results = results;   
    }   
      
    public Map<String, Object> getParams() {   
       return params;   
    }   
      
    public void setParams(Map<String, Object> params) {   
       this.params = params;   
    }   
    
    @Override  
    public String toString() {   
       StringBuilder builder = new StringBuilder();   
       builder.append("Page [page=").append(page).append(", rows=")   
              .append(rows).append(", results=").append(results).append(   
                     ", totalPage=").append(totalPage).append(   
                     ", totalRecord=").append(totalRecord).append("]");   
       return builder.toString();   
    }   
    
}  
