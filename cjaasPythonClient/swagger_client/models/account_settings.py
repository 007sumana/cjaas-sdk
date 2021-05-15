# coding: utf-8

"""
    Customer Journey as a Service (CJaaS)

    Something amazing, something special - the Customer Journey as a Service (CJaaS) is a core data layer to enable Journeys across products built upon serverless multi-cloud architecture, to be available as a SaaS service for applications inside and outside of Cisco. [**Cisco Experimental - Not For Production Use**]  # noqa: E501

    OpenAPI spec version: 0.5.0
    Contact: cjaas-earlyaccess@cisco.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class AccountSettings(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'data_retention_days': 'int',
        'destination_subscriptions': 'list[str]',
        'webex_token_issuer': 'str',
        'webex_token_issuer_secret': 'str'
    }

    attribute_map = {
        'data_retention_days': 'dataRetentionDays',
        'destination_subscriptions': 'destinationSubscriptions',
        'webex_token_issuer': 'webexTokenIssuer',
        'webex_token_issuer_secret': 'webexTokenIssuerSecret'
    }

    def __init__(self, data_retention_days=None, destination_subscriptions=None, webex_token_issuer=None, webex_token_issuer_secret=None):  # noqa: E501
        """AccountSettings - a model defined in Swagger"""  # noqa: E501
        self._data_retention_days = None
        self._destination_subscriptions = None
        self._webex_token_issuer = None
        self._webex_token_issuer_secret = None
        self.discriminator = None
        if data_retention_days is not None:
            self.data_retention_days = data_retention_days
        if destination_subscriptions is not None:
            self.destination_subscriptions = destination_subscriptions
        if webex_token_issuer is not None:
            self.webex_token_issuer = webex_token_issuer
        if webex_token_issuer_secret is not None:
            self.webex_token_issuer_secret = webex_token_issuer_secret

    @property
    def data_retention_days(self):
        """Gets the data_retention_days of this AccountSettings.  # noqa: E501


        :return: The data_retention_days of this AccountSettings.  # noqa: E501
        :rtype: int
        """
        return self._data_retention_days

    @data_retention_days.setter
    def data_retention_days(self, data_retention_days):
        """Sets the data_retention_days of this AccountSettings.


        :param data_retention_days: The data_retention_days of this AccountSettings.  # noqa: E501
        :type: int
        """

        self._data_retention_days = data_retention_days

    @property
    def destination_subscriptions(self):
        """Gets the destination_subscriptions of this AccountSettings.  # noqa: E501


        :return: The destination_subscriptions of this AccountSettings.  # noqa: E501
        :rtype: list[str]
        """
        return self._destination_subscriptions

    @destination_subscriptions.setter
    def destination_subscriptions(self, destination_subscriptions):
        """Sets the destination_subscriptions of this AccountSettings.


        :param destination_subscriptions: The destination_subscriptions of this AccountSettings.  # noqa: E501
        :type: list[str]
        """

        self._destination_subscriptions = destination_subscriptions

    @property
    def webex_token_issuer(self):
        """Gets the webex_token_issuer of this AccountSettings.  # noqa: E501


        :return: The webex_token_issuer of this AccountSettings.  # noqa: E501
        :rtype: str
        """
        return self._webex_token_issuer

    @webex_token_issuer.setter
    def webex_token_issuer(self, webex_token_issuer):
        """Sets the webex_token_issuer of this AccountSettings.


        :param webex_token_issuer: The webex_token_issuer of this AccountSettings.  # noqa: E501
        :type: str
        """

        self._webex_token_issuer = webex_token_issuer

    @property
    def webex_token_issuer_secret(self):
        """Gets the webex_token_issuer_secret of this AccountSettings.  # noqa: E501


        :return: The webex_token_issuer_secret of this AccountSettings.  # noqa: E501
        :rtype: str
        """
        return self._webex_token_issuer_secret

    @webex_token_issuer_secret.setter
    def webex_token_issuer_secret(self, webex_token_issuer_secret):
        """Sets the webex_token_issuer_secret of this AccountSettings.


        :param webex_token_issuer_secret: The webex_token_issuer_secret of this AccountSettings.  # noqa: E501
        :type: str
        """

        self._webex_token_issuer_secret = webex_token_issuer_secret

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(AccountSettings, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, AccountSettings):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other