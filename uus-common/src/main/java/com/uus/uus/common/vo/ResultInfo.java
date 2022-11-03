package com.uus.uus.common.vo;


public class ResultInfo {

    /**
     * 应答结果状态码——成功
     */
    public static final int RESULT_CODE_SUCCESS = 0;
    /**
     * 应答结果状态码——通用错误
     */
    public static final int RESULT_CODE_COMMONERR = -1;

    /**
     * 应答结果状态码——通用错误--系统异常
     */
    public static final int RESULT_CODE_SYSTEM = -999;

    /**
     * 应答结果状态码——通用错误--权限错误
     */
    public static final int RESULT_CODE_AUTH = -2;

    /**
     * 返回状态，默认0成功
     */
    private int status = RESULT_CODE_SUCCESS;

    /**
     * 返回状态描述
     */
    private String msg = "SUCCESS";

    /**
     * 返回数据  操作返回数据绑定
     */
    private Object re;

    /**
     * 返回一个默认的错误结果
     * @return 错误结果
     */
    public static ResultInfo error() {
        ResultInfo res = new ResultInfo(RESULT_CODE_COMMONERR, "ERROR");
        return res;
    }

    /**
     * 返回一个带错误信息的错误结果
     * @param errorMessage 错误信息
     * @return 错误结果
     */
    public static ResultInfo errorMessage(String errorMessage) {
        ResultInfo res = new ResultInfo(RESULT_CODE_COMMONERR, errorMessage);
        return res;
    }

    /**
     * 权限异常返回
     * @param errorMessage 错误信息
     * @return 错误结果
     */
    public static ResultInfo errorAuthMessage(String errorMessage) {
        ResultInfo res = new ResultInfo(RESULT_CODE_AUTH, errorMessage);
        return res;
    }

    /**
     * 返回一个带错误信息的系统异常
     * @param errorMessage 错误信息
     * @return 错误结果
     */
    public static ResultInfo errorSystem(String errorMessage) {
        ResultInfo res = new ResultInfo(RESULT_CODE_SYSTEM, errorMessage);
        return res;
    }

    /**
     * 返回一个带错误信息和数据的错误结果
     * @param errorMessage 错误信息
     * @param re 数据
     * @return 错误结果
     */
    public static ResultInfo errorMessage(String errorMessage, Object re) {
        ResultInfo res = new ResultInfo(RESULT_CODE_COMMONERR, errorMessage);
        res.setRe(re);
        return res;
    }

    /**
     * 返回一个带状态和信息的结果
     * @param status 状态
     * @param info 信息
     * @return 返回结果
     */
    public static ResultInfo result(int status, String info) {
        ResultInfo res = new ResultInfo();
        res.status = status;
        res.msg = info;
        return res;
    }

    /**
     * 返回一个带状态,信息和数据的结果
     * @param status 状态
     * @param info 信息
     * @param re 数据
     * @return 返回结果
     */
    public static ResultInfo result(int status, String info, Object re) {
        ResultInfo res = new ResultInfo();
        res.status = status;
        res.msg = info;
        res.re = re;
        return res;
    }

    /**
     * 返回一个成功结果
     * @return 成功结果
     */
    public static ResultInfo success() {
        ResultInfo res = new ResultInfo();
        return res;
    }

    /**
     * 返回一个带数据的成功结果
     * @param re 数据
     * @return 成功结果
     */
    public static ResultInfo success(Object re) {
        ResultInfo res = new ResultInfo();
        res.setRe(re);
        return res;
    }

    /**
     * 返回一个带数据的成功结果
     * @param message 消息
     * @param re 数据
     * @return 成功结果
     */
    public static ResultInfo success(String message, Object re) {
        ResultInfo res = new ResultInfo();
        res.setMsg(message);
        res.setRe(re);
        return res;
    }

    /**
     * 返回一个带信息的成功结果
     * @param message 提示信息
     * @return 成功结果
     */
    public static ResultInfo successMessage(String message) {
        ResultInfo res = new ResultInfo(RESULT_CODE_SUCCESS, message);
        return res;
    }

    /**
     * 默认构造函数
     */
    public ResultInfo() {
    }

    /**
     * 带状态和信息的构造函数
     * @param status 状态
     * @param msg 提示信息
     */
    public ResultInfo(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    /**
     * 带状态,信息和数据的构造函数
     * @param status 状态
     * @param msg 提示信息
     * @param re 数据
     */
    public ResultInfo(int status, String msg, Object re) {
        super();
        this.status = status;
        this.msg = msg;
        this.re = re;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((re == null) ? 0 : re.hashCode());
        result = prime * result + status;
        result = prime * result + ((msg == null) ? 0 : msg.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ResultInfo other = (ResultInfo) obj;
        if (re == null) {
            if (other.re != null) {
                return false;
            }
        } else if (!re.equals(other.re)) {
            return false;
        }
        if (status != other.status) {
            return false;
        }
        if (msg == null) {
            if (other.msg != null) {
                return false;
            }
        } else if (!msg.equals(other.msg)) {
            return false;
        }
        return true;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getRe() {
        return re;
    }

    public void setRe(Object re) {
        this.re = re;
    }
}

