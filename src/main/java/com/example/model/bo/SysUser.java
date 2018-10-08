package com.example.model.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * 账号实体类
 * 
 * @author Jackie
 * 
 */
public class SysUser extends BaseModel implements Serializable {

	private static final long serialVersionUID = -4756645881198820645L;
	
	private String user_id;// 账号ID
	private Dept dept;// 用户所属组织
	private String job_no;// 用户工号
    private String staff_name;// 用户姓名
    private String staff_duty;// 用户职务
    private String staff_sex;// 用户性别
    private String staff_email;// 用户邮箱
    private String staff_phone;// 用户电话

	private String login_name;// 登陆名
	private String password;// 密码
	private String p_salt;// 加密的盐值
	private Integer is_admin;// 是否管理员账号
	private Integer account_state;// 账号状态(0:未登录;1:已登录;2:密码已重置)
	private Date login_time;// 登入时间
	private Date logout_time;// 登出时间
	
	private List<Role> listRole;//角色集合
	private List<String> authList;//权限集合

	private String login_url;//非持久化字段
	private String newPassword;// 非持久化字段（新密码）



	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLogin_time() {
		return login_time;
	}

	public void setLogin_time(Date login_time) {
		this.login_time = login_time;
	}

	public Integer getIs_admin() {
		return is_admin;
	}

	public void setIs_admin(Integer is_admin) {
		this.is_admin = is_admin;
	}

	public String getP_salt() {
		return p_salt;
	}

	public void setP_salt(String p_salt) {
		this.p_salt = p_salt;
	}

	public String getLogin_url() {
		return login_url;
	}

	public void setLogin_url(String login_url) {
		this.login_url = login_url;
	}

	public List<Role> getListRole() {
		return listRole;
	}

	public void setListRole(List<Role> listRole) {
		this.listRole = listRole;
	}

	public List<String> getAuthList() {
		return authList;
	}

	public void setAuthList(List<String> authList) {
		this.authList = authList;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String getJob_no() {
        return job_no;
    }

    public void setJob_no(String job_no) {
        this.job_no = job_no;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getStaff_duty() {
        return staff_duty;
    }

    public void setStaff_duty(String staff_duty) {
        this.staff_duty = staff_duty;
    }

    public String getStaff_sex() {
        return staff_sex;
    }

    public void setStaff_sex(String staff_sex) {
        this.staff_sex = staff_sex;
    }

    public String getStaff_email() {
        return staff_email;
    }

    public void setStaff_email(String staff_email) {
        this.staff_email = staff_email;
    }

    public String getStaff_phone() {
        return staff_phone;
    }

    public void setStaff_phone(String staff_phone) {
        this.staff_phone = staff_phone;
    }

    public Integer getAccount_state() {
        return account_state;
    }

    public void setAccount_state(Integer account_state) {
        this.account_state = account_state;
    }

    public Date getLogout_time() {
        return logout_time;
    }

    public void setLogout_time(Date logout_time) {
        this.logout_time = logout_time;
    }
	
}
