package com.example.demo.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XkjcYmZbxGcdYjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XkjcYmZbxGcdYjExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBhIsNull() {
            addCriterion("bh is null");
            return (Criteria) this;
        }

        public Criteria andBhIsNotNull() {
            addCriterion("bh is not null");
            return (Criteria) this;
        }

        public Criteria andBhEqualTo(Integer value) {
            addCriterion("bh =", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotEqualTo(Integer value) {
            addCriterion("bh <>", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhGreaterThan(Integer value) {
            addCriterion("bh >", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhGreaterThanOrEqualTo(Integer value) {
            addCriterion("bh >=", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLessThan(Integer value) {
            addCriterion("bh <", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLessThanOrEqualTo(Integer value) {
            addCriterion("bh <=", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhIn(List<Integer> values) {
            addCriterion("bh in", values, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotIn(List<Integer> values) {
            addCriterion("bh not in", values, "bh");
            return (Criteria) this;
        }

        public Criteria andBhBetween(Integer value1, Integer value2) {
            addCriterion("bh between", value1, value2, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotBetween(Integer value1, Integer value2) {
            addCriterion("bh not between", value1, value2, "bh");
            return (Criteria) this;
        }

        public Criteria andYmBhIsNull() {
            addCriterion("ym_bh is null");
            return (Criteria) this;
        }

        public Criteria andYmBhIsNotNull() {
            addCriterion("ym_bh is not null");
            return (Criteria) this;
        }

        public Criteria andYmBhEqualTo(String value) {
            addCriterion("ym_bh =", value, "ymBh");
            return (Criteria) this;
        }

        public Criteria andYmBhNotEqualTo(String value) {
            addCriterion("ym_bh <>", value, "ymBh");
            return (Criteria) this;
        }

        public Criteria andYmBhGreaterThan(String value) {
            addCriterion("ym_bh >", value, "ymBh");
            return (Criteria) this;
        }

        public Criteria andYmBhGreaterThanOrEqualTo(String value) {
            addCriterion("ym_bh >=", value, "ymBh");
            return (Criteria) this;
        }

        public Criteria andYmBhLessThan(String value) {
            addCriterion("ym_bh <", value, "ymBh");
            return (Criteria) this;
        }

        public Criteria andYmBhLessThanOrEqualTo(String value) {
            addCriterion("ym_bh <=", value, "ymBh");
            return (Criteria) this;
        }

        public Criteria andYmBhLike(String value) {
            addCriterion("ym_bh like", value, "ymBh");
            return (Criteria) this;
        }

        public Criteria andYmBhNotLike(String value) {
            addCriterion("ym_bh not like", value, "ymBh");
            return (Criteria) this;
        }

        public Criteria andYmBhIn(List<String> values) {
            addCriterion("ym_bh in", values, "ymBh");
            return (Criteria) this;
        }

        public Criteria andYmBhNotIn(List<String> values) {
            addCriterion("ym_bh not in", values, "ymBh");
            return (Criteria) this;
        }

        public Criteria andYmBhBetween(String value1, String value2) {
            addCriterion("ym_bh between", value1, value2, "ymBh");
            return (Criteria) this;
        }

        public Criteria andYmBhNotBetween(String value1, String value2) {
            addCriterion("ym_bh not between", value1, value2, "ymBh");
            return (Criteria) this;
        }

        public Criteria andYmMcIsNull() {
            addCriterion("ym_mc is null");
            return (Criteria) this;
        }

        public Criteria andYmMcIsNotNull() {
            addCriterion("ym_mc is not null");
            return (Criteria) this;
        }

        public Criteria andYmMcEqualTo(String value) {
            addCriterion("ym_mc =", value, "ymMc");
            return (Criteria) this;
        }

        public Criteria andYmMcNotEqualTo(String value) {
            addCriterion("ym_mc <>", value, "ymMc");
            return (Criteria) this;
        }

        public Criteria andYmMcGreaterThan(String value) {
            addCriterion("ym_mc >", value, "ymMc");
            return (Criteria) this;
        }

        public Criteria andYmMcGreaterThanOrEqualTo(String value) {
            addCriterion("ym_mc >=", value, "ymMc");
            return (Criteria) this;
        }

        public Criteria andYmMcLessThan(String value) {
            addCriterion("ym_mc <", value, "ymMc");
            return (Criteria) this;
        }

        public Criteria andYmMcLessThanOrEqualTo(String value) {
            addCriterion("ym_mc <=", value, "ymMc");
            return (Criteria) this;
        }

        public Criteria andYmMcLike(String value) {
            addCriterion("ym_mc like", value, "ymMc");
            return (Criteria) this;
        }

        public Criteria andYmMcNotLike(String value) {
            addCriterion("ym_mc not like", value, "ymMc");
            return (Criteria) this;
        }

        public Criteria andYmMcIn(List<String> values) {
            addCriterion("ym_mc in", values, "ymMc");
            return (Criteria) this;
        }

        public Criteria andYmMcNotIn(List<String> values) {
            addCriterion("ym_mc not in", values, "ymMc");
            return (Criteria) this;
        }

        public Criteria andYmMcBetween(String value1, String value2) {
            addCriterion("ym_mc between", value1, value2, "ymMc");
            return (Criteria) this;
        }

        public Criteria andYmMcNotBetween(String value1, String value2) {
            addCriterion("ym_mc not between", value1, value2, "ymMc");
            return (Criteria) this;
        }

        public Criteria andZbxBhIsNull() {
            addCriterion("zbx_bh is null");
            return (Criteria) this;
        }

        public Criteria andZbxBhIsNotNull() {
            addCriterion("zbx_bh is not null");
            return (Criteria) this;
        }

        public Criteria andZbxBhEqualTo(String value) {
            addCriterion("zbx_bh =", value, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhNotEqualTo(String value) {
            addCriterion("zbx_bh <>", value, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhGreaterThan(String value) {
            addCriterion("zbx_bh >", value, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhGreaterThanOrEqualTo(String value) {
            addCriterion("zbx_bh >=", value, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhLessThan(String value) {
            addCriterion("zbx_bh <", value, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhLessThanOrEqualTo(String value) {
            addCriterion("zbx_bh <=", value, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhLike(String value) {
            addCriterion("zbx_bh like", value, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhNotLike(String value) {
            addCriterion("zbx_bh not like", value, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhIn(List<String> values) {
            addCriterion("zbx_bh in", values, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhNotIn(List<String> values) {
            addCriterion("zbx_bh not in", values, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhBetween(String value1, String value2) {
            addCriterion("zbx_bh between", value1, value2, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhNotBetween(String value1, String value2) {
            addCriterion("zbx_bh not between", value1, value2, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhIsNull() {
            addCriterion("gcd_bh is null");
            return (Criteria) this;
        }

        public Criteria andGcdBhIsNotNull() {
            addCriterion("gcd_bh is not null");
            return (Criteria) this;
        }

        public Criteria andGcdBhEqualTo(String value) {
            addCriterion("gcd_bh =", value, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhNotEqualTo(String value) {
            addCriterion("gcd_bh <>", value, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhGreaterThan(String value) {
            addCriterion("gcd_bh >", value, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhGreaterThanOrEqualTo(String value) {
            addCriterion("gcd_bh >=", value, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhLessThan(String value) {
            addCriterion("gcd_bh <", value, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhLessThanOrEqualTo(String value) {
            addCriterion("gcd_bh <=", value, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhLike(String value) {
            addCriterion("gcd_bh like", value, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhNotLike(String value) {
            addCriterion("gcd_bh not like", value, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhIn(List<String> values) {
            addCriterion("gcd_bh in", values, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhNotIn(List<String> values) {
            addCriterion("gcd_bh not in", values, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhBetween(String value1, String value2) {
            addCriterion("gcd_bh between", value1, value2, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhNotBetween(String value1, String value2) {
            addCriterion("gcd_bh not between", value1, value2, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andYjGcdBhIsNull() {
            addCriterion("yj_gcd_bh is null");
            return (Criteria) this;
        }

        public Criteria andYjGcdBhIsNotNull() {
            addCriterion("yj_gcd_bh is not null");
            return (Criteria) this;
        }

        public Criteria andYjGcdBhEqualTo(String value) {
            addCriterion("yj_gcd_bh =", value, "yjGcdBh");
            return (Criteria) this;
        }

        public Criteria andYjGcdBhNotEqualTo(String value) {
            addCriterion("yj_gcd_bh <>", value, "yjGcdBh");
            return (Criteria) this;
        }

        public Criteria andYjGcdBhGreaterThan(String value) {
            addCriterion("yj_gcd_bh >", value, "yjGcdBh");
            return (Criteria) this;
        }

        public Criteria andYjGcdBhGreaterThanOrEqualTo(String value) {
            addCriterion("yj_gcd_bh >=", value, "yjGcdBh");
            return (Criteria) this;
        }

        public Criteria andYjGcdBhLessThan(String value) {
            addCriterion("yj_gcd_bh <", value, "yjGcdBh");
            return (Criteria) this;
        }

        public Criteria andYjGcdBhLessThanOrEqualTo(String value) {
            addCriterion("yj_gcd_bh <=", value, "yjGcdBh");
            return (Criteria) this;
        }

        public Criteria andYjGcdBhLike(String value) {
            addCriterion("yj_gcd_bh like", value, "yjGcdBh");
            return (Criteria) this;
        }

        public Criteria andYjGcdBhNotLike(String value) {
            addCriterion("yj_gcd_bh not like", value, "yjGcdBh");
            return (Criteria) this;
        }

        public Criteria andYjGcdBhIn(List<String> values) {
            addCriterion("yj_gcd_bh in", values, "yjGcdBh");
            return (Criteria) this;
        }

        public Criteria andYjGcdBhNotIn(List<String> values) {
            addCriterion("yj_gcd_bh not in", values, "yjGcdBh");
            return (Criteria) this;
        }

        public Criteria andYjGcdBhBetween(String value1, String value2) {
            addCriterion("yj_gcd_bh between", value1, value2, "yjGcdBh");
            return (Criteria) this;
        }

        public Criteria andYjGcdBhNotBetween(String value1, String value2) {
            addCriterion("yj_gcd_bh not between", value1, value2, "yjGcdBh");
            return (Criteria) this;
        }

        public Criteria andIsExistsIsNull() {
            addCriterion("is_exists is null");
            return (Criteria) this;
        }

        public Criteria andIsExistsIsNotNull() {
            addCriterion("is_exists is not null");
            return (Criteria) this;
        }

        public Criteria andIsExistsEqualTo(Integer value) {
            addCriterion("is_exists =", value, "isExists");
            return (Criteria) this;
        }

        public Criteria andIsExistsNotEqualTo(Integer value) {
            addCriterion("is_exists <>", value, "isExists");
            return (Criteria) this;
        }

        public Criteria andIsExistsGreaterThan(Integer value) {
            addCriterion("is_exists >", value, "isExists");
            return (Criteria) this;
        }

        public Criteria andIsExistsGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_exists >=", value, "isExists");
            return (Criteria) this;
        }

        public Criteria andIsExistsLessThan(Integer value) {
            addCriterion("is_exists <", value, "isExists");
            return (Criteria) this;
        }

        public Criteria andIsExistsLessThanOrEqualTo(Integer value) {
            addCriterion("is_exists <=", value, "isExists");
            return (Criteria) this;
        }

        public Criteria andIsExistsIn(List<Integer> values) {
            addCriterion("is_exists in", values, "isExists");
            return (Criteria) this;
        }

        public Criteria andIsExistsNotIn(List<Integer> values) {
            addCriterion("is_exists not in", values, "isExists");
            return (Criteria) this;
        }

        public Criteria andIsExistsBetween(Integer value1, Integer value2) {
            addCriterion("is_exists between", value1, value2, "isExists");
            return (Criteria) this;
        }

        public Criteria andIsExistsNotBetween(Integer value1, Integer value2) {
            addCriterion("is_exists not between", value1, value2, "isExists");
            return (Criteria) this;
        }

        public Criteria andIsCheckedIsNull() {
            addCriterion("is_checked is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckedIsNotNull() {
            addCriterion("is_checked is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckedEqualTo(Integer value) {
            addCriterion("is_checked =", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedNotEqualTo(Integer value) {
            addCriterion("is_checked <>", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedGreaterThan(Integer value) {
            addCriterion("is_checked >", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_checked >=", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedLessThan(Integer value) {
            addCriterion("is_checked <", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedLessThanOrEqualTo(Integer value) {
            addCriterion("is_checked <=", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedIn(List<Integer> values) {
            addCriterion("is_checked in", values, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedNotIn(List<Integer> values) {
            addCriterion("is_checked not in", values, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedBetween(Integer value1, Integer value2) {
            addCriterion("is_checked between", value1, value2, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_checked not between", value1, value2, "isChecked");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}