package com.example.demo.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XkjcXkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XkjcXkExample() {
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

        public Criteria andXkBhIsNull() {
            addCriterion("xk_bh is null");
            return (Criteria) this;
        }

        public Criteria andXkBhIsNotNull() {
            addCriterion("xk_bh is not null");
            return (Criteria) this;
        }

        public Criteria andXkBhEqualTo(String value) {
            addCriterion("xk_bh =", value, "xkBh");
            return (Criteria) this;
        }

        public Criteria andXkBhNotEqualTo(String value) {
            addCriterion("xk_bh <>", value, "xkBh");
            return (Criteria) this;
        }

        public Criteria andXkBhGreaterThan(String value) {
            addCriterion("xk_bh >", value, "xkBh");
            return (Criteria) this;
        }

        public Criteria andXkBhGreaterThanOrEqualTo(String value) {
            addCriterion("xk_bh >=", value, "xkBh");
            return (Criteria) this;
        }

        public Criteria andXkBhLessThan(String value) {
            addCriterion("xk_bh <", value, "xkBh");
            return (Criteria) this;
        }

        public Criteria andXkBhLessThanOrEqualTo(String value) {
            addCriterion("xk_bh <=", value, "xkBh");
            return (Criteria) this;
        }

        public Criteria andXkBhLike(String value) {
            addCriterion("xk_bh like", value, "xkBh");
            return (Criteria) this;
        }

        public Criteria andXkBhNotLike(String value) {
            addCriterion("xk_bh not like", value, "xkBh");
            return (Criteria) this;
        }

        public Criteria andXkBhIn(List<String> values) {
            addCriterion("xk_bh in", values, "xkBh");
            return (Criteria) this;
        }

        public Criteria andXkBhNotIn(List<String> values) {
            addCriterion("xk_bh not in", values, "xkBh");
            return (Criteria) this;
        }

        public Criteria andXkBhBetween(String value1, String value2) {
            addCriterion("xk_bh between", value1, value2, "xkBh");
            return (Criteria) this;
        }

        public Criteria andXkBhNotBetween(String value1, String value2) {
            addCriterion("xk_bh not between", value1, value2, "xkBh");
            return (Criteria) this;
        }

        public Criteria andXkMcIsNull() {
            addCriterion("xk_mc is null");
            return (Criteria) this;
        }

        public Criteria andXkMcIsNotNull() {
            addCriterion("xk_mc is not null");
            return (Criteria) this;
        }

        public Criteria andXkMcEqualTo(String value) {
            addCriterion("xk_mc =", value, "xkMc");
            return (Criteria) this;
        }

        public Criteria andXkMcNotEqualTo(String value) {
            addCriterion("xk_mc <>", value, "xkMc");
            return (Criteria) this;
        }

        public Criteria andXkMcGreaterThan(String value) {
            addCriterion("xk_mc >", value, "xkMc");
            return (Criteria) this;
        }

        public Criteria andXkMcGreaterThanOrEqualTo(String value) {
            addCriterion("xk_mc >=", value, "xkMc");
            return (Criteria) this;
        }

        public Criteria andXkMcLessThan(String value) {
            addCriterion("xk_mc <", value, "xkMc");
            return (Criteria) this;
        }

        public Criteria andXkMcLessThanOrEqualTo(String value) {
            addCriterion("xk_mc <=", value, "xkMc");
            return (Criteria) this;
        }

        public Criteria andXkMcLike(String value) {
            addCriterion("xk_mc like", value, "xkMc");
            return (Criteria) this;
        }

        public Criteria andXkMcNotLike(String value) {
            addCriterion("xk_mc not like", value, "xkMc");
            return (Criteria) this;
        }

        public Criteria andXkMcIn(List<String> values) {
            addCriterion("xk_mc in", values, "xkMc");
            return (Criteria) this;
        }

        public Criteria andXkMcNotIn(List<String> values) {
            addCriterion("xk_mc not in", values, "xkMc");
            return (Criteria) this;
        }

        public Criteria andXkMcBetween(String value1, String value2) {
            addCriterion("xk_mc between", value1, value2, "xkMc");
            return (Criteria) this;
        }

        public Criteria andXkMcNotBetween(String value1, String value2) {
            addCriterion("xk_mc not between", value1, value2, "xkMc");
            return (Criteria) this;
        }

        public Criteria andXkOrderIsNull() {
            addCriterion("xk_order is null");
            return (Criteria) this;
        }

        public Criteria andXkOrderIsNotNull() {
            addCriterion("xk_order is not null");
            return (Criteria) this;
        }

        public Criteria andXkOrderEqualTo(Integer value) {
            addCriterion("xk_order =", value, "xkOrder");
            return (Criteria) this;
        }

        public Criteria andXkOrderNotEqualTo(Integer value) {
            addCriterion("xk_order <>", value, "xkOrder");
            return (Criteria) this;
        }

        public Criteria andXkOrderGreaterThan(Integer value) {
            addCriterion("xk_order >", value, "xkOrder");
            return (Criteria) this;
        }

        public Criteria andXkOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("xk_order >=", value, "xkOrder");
            return (Criteria) this;
        }

        public Criteria andXkOrderLessThan(Integer value) {
            addCriterion("xk_order <", value, "xkOrder");
            return (Criteria) this;
        }

        public Criteria andXkOrderLessThanOrEqualTo(Integer value) {
            addCriterion("xk_order <=", value, "xkOrder");
            return (Criteria) this;
        }

        public Criteria andXkOrderIn(List<Integer> values) {
            addCriterion("xk_order in", values, "xkOrder");
            return (Criteria) this;
        }

        public Criteria andXkOrderNotIn(List<Integer> values) {
            addCriterion("xk_order not in", values, "xkOrder");
            return (Criteria) this;
        }

        public Criteria andXkOrderBetween(Integer value1, Integer value2) {
            addCriterion("xk_order between", value1, value2, "xkOrder");
            return (Criteria) this;
        }

        public Criteria andXkOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("xk_order not between", value1, value2, "xkOrder");
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

        public Criteria andIsEsiIsNull() {
            addCriterion("is_esi is null");
            return (Criteria) this;
        }

        public Criteria andIsEsiIsNotNull() {
            addCriterion("is_esi is not null");
            return (Criteria) this;
        }

        public Criteria andIsEsiEqualTo(Integer value) {
            addCriterion("is_esi =", value, "isEsi");
            return (Criteria) this;
        }

        public Criteria andIsEsiNotEqualTo(Integer value) {
            addCriterion("is_esi <>", value, "isEsi");
            return (Criteria) this;
        }

        public Criteria andIsEsiGreaterThan(Integer value) {
            addCriterion("is_esi >", value, "isEsi");
            return (Criteria) this;
        }

        public Criteria andIsEsiGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_esi >=", value, "isEsi");
            return (Criteria) this;
        }

        public Criteria andIsEsiLessThan(Integer value) {
            addCriterion("is_esi <", value, "isEsi");
            return (Criteria) this;
        }

        public Criteria andIsEsiLessThanOrEqualTo(Integer value) {
            addCriterion("is_esi <=", value, "isEsi");
            return (Criteria) this;
        }

        public Criteria andIsEsiIn(List<Integer> values) {
            addCriterion("is_esi in", values, "isEsi");
            return (Criteria) this;
        }

        public Criteria andIsEsiNotIn(List<Integer> values) {
            addCriterion("is_esi not in", values, "isEsi");
            return (Criteria) this;
        }

        public Criteria andIsEsiBetween(Integer value1, Integer value2) {
            addCriterion("is_esi between", value1, value2, "isEsi");
            return (Criteria) this;
        }

        public Criteria andIsEsiNotBetween(Integer value1, Integer value2) {
            addCriterion("is_esi not between", value1, value2, "isEsi");
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