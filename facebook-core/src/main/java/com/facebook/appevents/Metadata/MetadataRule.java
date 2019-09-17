/*
 * Copyright (c) 2014-present, Facebook, Inc. All rights reserved.
 *
 * You are hereby granted a non-exclusive, worldwide, royalty-free license to use,
 * copy, modify, and distribute this software in source code or binary form for use
 * in connection with the web services and APIs provided by Facebook.
 *
 * As with any software that integrates with the Facebook platform, your use of
 * this software is subject to the Facebook Developer Principles and Policies
 * [http://developers.facebook.com/policy/]. This copyright notice shall be
 * included in all copies or substantial portions of the software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.facebook.appevents.Metadata;

import java.util.ArrayList;
import java.util.List;

final class MetadataRule {
    private static final String TAG = MetadataRule.class.getCanonicalName();
    private static List<MetadataRule> rules = new ArrayList<>();
    private String name;
    private List<String> keyRules;
    private String valRule;
    private boolean isEnabled = false;

    private MetadataRule(String name, List<String> keyRules, String valRule) {
        this.name = name;
        this.keyRules = keyRules;
        this.valRule = valRule;
    }

    static void refreshEnabledStatusAndUpdateCache() {
        for (MetadataRule rule : rules) {
//            TODO: Enable rule here
            if (!rule.isEnabled) {
//                TODO: uncommon this line when remove rule is added
//                UserDataStore.remove(rule.name);
            }
        }
    }

    static boolean hasRuleEnabled() {
        for (MetadataRule rule : rules) {
            if (rule.isEnabled) {
                return true;
            }
        }
        return false;
    }

    static List<MetadataRule> getRules() {
        return new ArrayList<>(rules);
    }

    String getName() {
        return name;
    }

    List<String> getKeyRules() {
        return new ArrayList<>(keyRules);
    }

    String getValRule() {
        return valRule;
    }

    boolean getIsEnabled() {
        return isEnabled;
    }
}
