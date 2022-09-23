package com.example.demo.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class XkjcYjGcdConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XkjcYjGcdConfigExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andModuleIsNull() {
            addCriterion("module is null");
            return (Criteria) this;
        }

        public Criteria andModuleIsNotNull() {
            addCriterion("module is not null");
            return (Criteria) this;
        }

        public Criteria andModuleEqualTo(String value) {
            addCriterion("module =", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotEqualTo(String value) {
            addCriterion("module <>", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThan(String value) {
            addCriterion("module >", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThanOrEqualTo(String value) {
            addCriterion("module >=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThan(String value) {
            addCriterion("module <", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThanOrEqualTo(String value) {
            addCriterion("module <=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLike(String value) {
            addCriterion("module like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotLike(String value) {
            addCriterion("module not like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleIn(List<String> values) {
            addCriterion("module in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotIn(List<String> values) {
            addCriterion("module not in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleBetween(String value1, String value2) {
            addCriterion("module between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotBetween(String value1, String value2) {
            addCriterion("module not between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeIsNull() {
            addCriterion("subject_code is null");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeIsNotNull() {
            addCriterion("subject_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeEqualTo(String value) {
            addCriterion("subject_code =", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeNotEqualTo(String value) {
            addCriterion("subject_code <>", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeGreaterThan(String value) {
            addCriterion("subject_code >", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("subject_code >=", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeLessThan(String value) {
            addCriterion("subject_code <", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeLessThanOrEqualTo(String value) {
            addCriterion("subject_code <=", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeLike(String value) {
            addCriterion("subject_code like", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeNotLike(String value) {
            addCriterion("subject_code not like", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeIn(List<String> values) {
            addCriterion("subject_code in", values, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeNotIn(List<String> values) {
            addCriterion("subject_code not in", values, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeBetween(String value1, String value2) {
            addCriterion("subject_code between", value1, value2, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeNotBetween(String value1, String value2) {
            addCriterion("subject_code not between", value1, value2, "subjectCode");
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

        public Criteria andZbxMcIsNull() {
            addCriterion("zbx_mc is null");
            return (Criteria) this;
        }

        public Criteria andZbxMcIsNotNull() {
            addCriterion("zbx_mc is not null");
            return (Criteria) this;
        }

        public Criteria andZbxMcEqualTo(String value) {
            addCriterion("zbx_mc =", value, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcNotEqualTo(String value) {
            addCriterion("zbx_mc <>", value, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcGreaterThan(String value) {
            addCriterion("zbx_mc >", value, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcGreaterThanOrEqualTo(String value) {
            addCriterion("zbx_mc >=", value, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcLessThan(String value) {
            addCriterion("zbx_mc <", value, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcLessThanOrEqualTo(String value) {
            addCriterion("zbx_mc <=", value, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcLike(String value) {
            addCriterion("zbx_mc like", value, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcNotLike(String value) {
            addCriterion("zbx_mc not like", value, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcIn(List<String> values) {
            addCriterion("zbx_mc in", values, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcNotIn(List<String> values) {
            addCriterion("zbx_mc not in", values, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcBetween(String value1, String value2) {
            addCriterion("zbx_mc between", value1, value2, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcNotBetween(String value1, String value2) {
            addCriterion("zbx_mc not between", value1, value2, "zbxMc");
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

        public Criteria andGcdMcIsNull() {
            addCriterion("gcd_mc is null");
            return (Criteria) this;
        }

        public Criteria andGcdMcIsNotNull() {
            addCriterion("gcd_mc is not null");
            return (Criteria) this;
        }

        public Criteria andGcdMcEqualTo(String value) {
            addCriterion("gcd_mc =", value, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcNotEqualTo(String value) {
            addCriterion("gcd_mc <>", value, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcGreaterThan(String value) {
            addCriterion("gcd_mc >", value, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcGreaterThanOrEqualTo(String value) {
            addCriterion("gcd_mc >=", value, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcLessThan(String value) {
            addCriterion("gcd_mc <", value, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcLessThanOrEqualTo(String value) {
            addCriterion("gcd_mc <=", value, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcLike(String value) {
            addCriterion("gcd_mc like", value, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcNotLike(String value) {
            addCriterion("gcd_mc not like", value, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcIn(List<String> values) {
            addCriterion("gcd_mc in", values, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcNotIn(List<String> values) {
            addCriterion("gcd_mc not in", values, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcBetween(String value1, String value2) {
            addCriterion("gcd_mc between", value1, value2, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcNotBetween(String value1, String value2) {
            addCriterion("gcd_mc not between", value1, value2, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andNfIsNull() {
            addCriterion("nf is null");
            return (Criteria) this;
        }

        public Criteria andNfIsNotNull() {
            addCriterion("nf is not null");
            return (Criteria) this;
        }

        public Criteria andNfEqualTo(String value) {
            addCriterion("nf =", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfNotEqualTo(String value) {
            addCriterion("nf <>", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfGreaterThan(String value) {
            addCriterion("nf >", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfGreaterThanOrEqualTo(String value) {
            addCriterion("nf >=", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfLessThan(String value) {
            addCriterion("nf <", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfLessThanOrEqualTo(String value) {
            addCriterion("nf <=", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfLike(String value) {
            addCriterion("nf like", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfNotLike(String value) {
            addCriterion("nf not like", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfIn(List<String> values) {
            addCriterion("nf in", values, "nf");
            return (Criteria) this;
        }

        public Criteria andNfNotIn(List<String> values) {
            addCriterion("nf not in", values, "nf");
            return (Criteria) this;
        }

        public Criteria andNfBetween(String value1, String value2) {
            addCriterion("nf between", value1, value2, "nf");
            return (Criteria) this;
        }

        public Criteria andNfNotBetween(String value1, String value2) {
            addCriterion("nf not between", value1, value2, "nf");
            return (Criteria) this;
        }

        public Criteria andNfTypeIsNull() {
            addCriterion("nf_type is null");
            return (Criteria) this;
        }

        public Criteria andNfTypeIsNotNull() {
            addCriterion("nf_type is not null");
            return (Criteria) this;
        }

        public Criteria andNfTypeEqualTo(String value) {
            addCriterion("nf_type =", value, "nfType");
            return (Criteria) this;
        }

        public Criteria andNfTypeNotEqualTo(String value) {
            addCriterion("nf_type <>", value, "nfType");
            return (Criteria) this;
        }

        public Criteria andNfTypeGreaterThan(String value) {
            addCriterion("nf_type >", value, "nfType");
            return (Criteria) this;
        }

        public Criteria andNfTypeGreaterThanOrEqualTo(String value) {
            addCriterion("nf_type >=", value, "nfType");
            return (Criteria) this;
        }

        public Criteria andNfTypeLessThan(String value) {
            addCriterion("nf_type <", value, "nfType");
            return (Criteria) this;
        }

        public Criteria andNfTypeLessThanOrEqualTo(String value) {
            addCriterion("nf_type <=", value, "nfType");
            return (Criteria) this;
        }

        public Criteria andNfTypeLike(String value) {
            addCriterion("nf_type like", value, "nfType");
            return (Criteria) this;
        }

        public Criteria andNfTypeNotLike(String value) {
            addCriterion("nf_type not like", value, "nfType");
            return (Criteria) this;
        }

        public Criteria andNfTypeIn(List<String> values) {
            addCriterion("nf_type in", values, "nfType");
            return (Criteria) this;
        }

        public Criteria andNfTypeNotIn(List<String> values) {
            addCriterion("nf_type not in", values, "nfType");
            return (Criteria) this;
        }

        public Criteria andNfTypeBetween(String value1, String value2) {
            addCriterion("nf_type between", value1, value2, "nfType");
            return (Criteria) this;
        }

        public Criteria andNfTypeNotBetween(String value1, String value2) {
            addCriterion("nf_type not between", value1, value2, "nfType");
            return (Criteria) this;
        }

        public Criteria andThresholdIsNull() {
            addCriterion("threshold is null");
            return (Criteria) this;
        }

        public Criteria andThresholdIsNotNull() {
            addCriterion("threshold is not null");
            return (Criteria) this;
        }

        public Criteria andThresholdEqualTo(String value) {
            addCriterion("threshold =", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotEqualTo(String value) {
            addCriterion("threshold <>", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdGreaterThan(String value) {
            addCriterion("threshold >", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdGreaterThanOrEqualTo(String value) {
            addCriterion("threshold >=", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdLessThan(String value) {
            addCriterion("threshold <", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdLessThanOrEqualTo(String value) {
            addCriterion("threshold <=", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdLike(String value) {
            addCriterion("threshold like", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotLike(String value) {
            addCriterion("threshold not like", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdIn(List<String> values) {
            addCriterion("threshold in", values, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotIn(List<String> values) {
            addCriterion("threshold not in", values, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdBetween(String value1, String value2) {
            addCriterion("threshold between", value1, value2, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotBetween(String value1, String value2) {
            addCriterion("threshold not between", value1, value2, "threshold");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andWarnTimeIsNull() {
            addCriterion("warn_time is null");
            return (Criteria) this;
        }

        public Criteria andWarnTimeIsNotNull() {
            addCriterion("warn_time is not null");
            return (Criteria) this;
        }

        public Criteria andWarnTimeEqualTo(Date value) {
            addCriterionForJDBCDate("warn_time =", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("warn_time <>", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("warn_time >", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("warn_time >=", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeLessThan(Date value) {
            addCriterionForJDBCDate("warn_time <", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("warn_time <=", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeIn(List<Date> values) {
            addCriterionForJDBCDate("warn_time in", values, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("warn_time not in", values, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("warn_time between", value1, value2, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("warn_time not between", value1, value2, "warnTime");
            return (Criteria) this;
        }

        public Criteria andIsAlertIsNull() {
            addCriterion("is_alert is null");
            return (Criteria) this;
        }

        public Criteria andIsAlertIsNotNull() {
            addCriterion("is_alert is not null");
            return (Criteria) this;
        }

        public Criteria andIsAlertEqualTo(Integer value) {
            addCriterion("is_alert =", value, "isAlert");
            return (Criteria) this;
        }

        public Criteria andIsAlertNotEqualTo(Integer value) {
            addCriterion("is_alert <>", value, "isAlert");
            return (Criteria) this;
        }

        public Criteria andIsAlertGreaterThan(Integer value) {
            addCriterion("is_alert >", value, "isAlert");
            return (Criteria) this;
        }

        public Criteria andIsAlertGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_alert >=", value, "isAlert");
            return (Criteria) this;
        }

        public Criteria andIsAlertLessThan(Integer value) {
            addCriterion("is_alert <", value, "isAlert");
            return (Criteria) this;
        }

        public Criteria andIsAlertLessThanOrEqualTo(Integer value) {
            addCriterion("is_alert <=", value, "isAlert");
            return (Criteria) this;
        }

        public Criteria andIsAlertIn(List<Integer> values) {
            addCriterion("is_alert in", values, "isAlert");
            return (Criteria) this;
        }

        public Criteria andIsAlertNotIn(List<Integer> values) {
            addCriterion("is_alert not in", values, "isAlert");
            return (Criteria) this;
        }

        public Criteria andIsAlertBetween(Integer value1, Integer value2) {
            addCriterion("is_alert between", value1, value2, "isAlert");
            return (Criteria) this;
        }

        public Criteria andIsAlertNotBetween(Integer value1, Integer value2) {
            addCriterion("is_alert not between", value1, value2, "isAlert");
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

        public Criteria andYjGcdOrderIsNull() {
            addCriterion("yj_gcd_order is null");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderIsNotNull() {
            addCriterion("yj_gcd_order is not null");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderEqualTo(Integer value) {
            addCriterion("yj_gcd_order =", value, "yjGcdOrder");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderNotEqualTo(Integer value) {
            addCriterion("yj_gcd_order <>", value, "yjGcdOrder");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderGreaterThan(Integer value) {
            addCriterion("yj_gcd_order >", value, "yjGcdOrder");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("yj_gcd_order >=", value, "yjGcdOrder");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderLessThan(Integer value) {
            addCriterion("yj_gcd_order <", value, "yjGcdOrder");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderLessThanOrEqualTo(Integer value) {
            addCriterion("yj_gcd_order <=", value, "yjGcdOrder");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderIn(List<Integer> values) {
            addCriterion("yj_gcd_order in", values, "yjGcdOrder");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderNotIn(List<Integer> values) {
            addCriterion("yj_gcd_order not in", values, "yjGcdOrder");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderBetween(Integer value1, Integer value2) {
            addCriterion("yj_gcd_order between", value1, value2, "yjGcdOrder");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("yj_gcd_order not between", value1, value2, "yjGcdOrder");
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